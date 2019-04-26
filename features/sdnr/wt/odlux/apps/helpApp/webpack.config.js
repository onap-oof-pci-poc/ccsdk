/**
 * Webpack 4 configuration file
 * see https://webpack.js.org/configuration/
 * see https://webpack.js.org/configuration/dev-server/
 */

"use strict";

const path = require("path");
const webpack = require("webpack");
const autoprefixer = require('autoprefixer');
const CopyWebpackPlugin = require("copy-webpack-plugin");
const TerserPlugin = require('terser-webpack-plugin');

// const __dirname = (path => path.replace(/^([a-z]\:)/, c => c.toUpperCase()))(process.__dirname());

module.exports = (env) => {
  const distPath = path.resolve(__dirname, env === "release" ? "." : "../..", "dist");
  const frameworkPath = path.resolve(__dirname, env === "release" ? "../../framework" : "../..", "dist");
  return [{
    name: "App",

    mode: "none", //disable default behavior

    target: "web",

    context: path.resolve(__dirname, "src"),

    entry: {
      helpApp: ["./plugin.tsx"]
    },

    devtool: env === "release" ? false : "source-map",

    resolve: {
      extensions: [".ts", ".tsx", ".js", ".jsx"]
    },

    output: {
      path: distPath,
      filename: "[name].js",
      library: "[name]",
      libraryTarget: "umd2",
      chunkFilename: "[name].js"
    },
    module: {
      rules: [{
        test: /\.tsx?$/,
        exclude: /node_modules/,
        use: [{
          loader: "babel-loader"
        }, {
          loader: "ts-loader"
        }]
      }, {
        test: /\.jsx?$/,
        exclude: /node_modules/,
        use: [{
          loader: "babel-loader"
        }]
      }, {
        test: /\.css$/,
        use: [{
          loader: 'style-loader'
        }, {
          loader: 'css-loader',
          options: {
            modules: true,
            localIdentName: env !== "release" ? '[name]_[local]_[hash:base64:5]' : '[hash]'
          }
        }, {
          loader: 'postcss-loader',
          options: {
            plugins: () => [autoprefixer]
          }
        }]
      }]
    },

    optimization: {
      noEmitOnErrors: true,
      namedModules: env !== "release",
      minimize: env === "release",
      minimizer: env !== "release" ? [] : [new TerserPlugin({
        terserOptions: {
          warnings: false, // false, true, "verbose"
          compress: {
            drop_console: true,
            drop_debugger: true,
          }
        }
      })],
    },

    plugins: [
      new webpack.DllReferencePlugin({
        context: path.resolve(__dirname, "../../framework/src"),
        manifest: require(path.resolve(frameworkPath, "vendor-manifest.json")),
        sourceType: "umd2"
      }),
      new webpack.DllReferencePlugin({
        context: path.resolve(__dirname, "../../framework/src"),
        manifest: require(path.resolve(frameworkPath, "app-manifest.json")),
        sourceType: "umd2"
      }),
      ...(env === "release") ? [
        new webpack.DefinePlugin({
          "process.env": {
            NODE_ENV: "'production'",
            VERSION: JSON.stringify(require("./package.json").version)
          }
        }),
      ] : [
          new webpack.DefinePlugin({
            "process.env": {
              NODE_ENV: "'development'",
              VERSION: JSON.stringify(require("./package.json").version)
            }
          }),
          new CopyWebpackPlugin([{
            from: 'index.html',
            to: distPath
          }]),
        ]
    ],

    devServer: {
      public: "http://localhost:3100",
      contentBase: frameworkPath,

      compress: true,
      headers: {
        "Access-Control-Allow-Origin": "*"
      },
      host: "0.0.0.0",
      port: 3100,
      disableHostCheck: true,
      historyApiFallback: true,
      inline: true,
      hot: false,
      quiet: false,
      stats: {
        colors: true
      },
      proxy: {
        "/oauth2/": {
          target: "http://localhost:3000",
          secure: false
        },
        "/database/": {
          target: "http://localhost:3000",
          secure: false
        },
        "/restconf/": {
          target: "http://localhost:3000",
          secure: false
        },
        "/help/": {
          target: "http://localhost:3000",
          secure: false
        },
        "/websocket/": {
          target: "http://localhost:3000",
          ws: true,
          changeOrigin: true,
          secure: false
        }
      }
    }
  }];
}
