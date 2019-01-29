/**
 * Webpack 4 configuration file
 * see https://webpack.js.org/configuration/
 * see https://webpack.js.org/configuration/dev-server/
 */

"use strict";

const path = require("path");
const webpack = require("webpack");
const CopyWebpackPlugin = require("copy-webpack-plugin");
const requirejsPlugin = require('requirejs-webpack-plugin');
const TerserPlugin = require('terser-webpack-plugin');

// const __dirname = (path => path.replace(/^([a-z]\:)/, c => c.toUpperCase()))(process.__dirname());

module.exports = (env) => {
  const distPath = path.resolve(__dirname, env === "release" ? "." : "..", "dist");
  const frameworkPath = path.resolve(__dirname, env === "release" ? "." : "..", "dist");
  return [{
    name: "Client",
    mode: "none", //disable default behavior
    target: "web",

    context: path.resolve(__dirname, "src"),

    entry: {
      app: [
        "./app.tsx",
        "./services",
        "./components/material-table",
        "./components/material-ui",
        "./utilities/elasticSearch",
        "./models"],
    },

    devtool: env === "release" ? false : "source-map",

    resolve: {
      extensions: [".ts", ".tsx", ".js", ".jsx"]
    },

    output: {
      path: distPath,
      library: "[name]", // related to webpack.DllPlugin::name
      libraryTarget: "umd2",
      filename: "[name].js",
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
        test: /\.(png|gif|jpg|svg)$/,
        use: [{
          loader: 'url-loader',
          options: {
            limit: 10000,
            name: './images/[hash].[ext]'
          }
        }]
      }]
    },

    optimization: {
      noEmitOnErrors: true,
      namedModules: true,
      minimize: false,
      minimizer: [],
    },

    plugins: [
      new CopyWebpackPlugin([{
        from: '../../node_modules/requirejs/require.js',
        to: '.'
      }, {
        from: './favicon.ico',
        to: '.'
      }, {
        from: './index.html',
        to: '.'
      }]),
      new requirejsPlugin({
        path: distPath,
        filename: 'config.js',
        baseUrl: '',
        pathUrl: '',
        processOutput: function (assets) {
          return 'require.config(' + JSON.stringify(assets, null, 2) + ')';
        }
      }),
      // new HtmlWebpackPlugin({
      //   filename: "index.html",
      //   template: "./index.html",
      //   inject: "head"
      // }),
      // new HtmlWebpackIncludeAssetsPlugin({
      //    assets: ['vendor.js'],
      //    append: false
      // }),
      new webpack.DllReferencePlugin({
        context: path.resolve(__dirname, "src"),
        manifest: require(path.resolve(frameworkPath, "vendor-manifest.json")),
        sourceType: "umd2"
      }),
      new webpack.DllPlugin({
        context: path.resolve(__dirname, "src"),
        name: "[name]",
        path: path.resolve(distPath, "[name]-manifest.json")
      }),
      ...(env === "release") ? [
        new webpack.DefinePlugin({
          "process.env": {
            NODE_ENV: "'production'",
            VERSION: JSON.stringify(require("./package.json").version)
          }
        }),
      ] : [
          new webpack.HotModuleReplacementPlugin(),
          new webpack.DefinePlugin({
            "process.env": {
              NODE_ENV: "'development'",
              VERSION: JSON.stringify(require("./package.json").version)
            }
          }),
          new webpack.WatchIgnorePlugin([
            /css\.d\.ts$/,
            /less\.d\.ts$/
          ])
        ]
    ],

    devServer: {
      public: "http://localhost:3100",
      contentBase: distPath,

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
        "/api/**/*": {
          target: "http://localhost:3001",
          secure: false
        }
      }
    }

  }];
}


