# Developing a ODLUX application

## Prerequisites

* Node: 8.10 or higher
* Yarn: 1.12.3 or higher
* Lerna: 3.10.7 or higher

You can install these globally or let it be installed by maven due "mvn clean install"

* Maven: 3 or higher
* Java: 8 or higher

## Dev-Environment Installation

 * install NodeJS LTS https://nodejs.org/en/ or via packetmanager
 * sudo npm install -g yarn
 * sudo yarn global add lerna
 * get framework from repository: git clone https://gerrit.onap.org/r/ccsdk/features
 * in features/sdnr/wt/odlux you find a structure like this:
 ```
  odlux
  |-apps
  |-core
  |-framework

 ```
 * go to features/sdnr/wt/odlux/apps and create your app: 
 ```
 mvn archetype:generate -DarchetypeGroupId=org.onap.ccsdk.features.sdnr.wt \
  -DarchetypeArtifactId=odlux-app-archetype \
  -DgroupId=<groupId> \
  -DartifactId=<artifactId> \
  -Dversion=<version> \
  -DappName=<applicationName>
 ```

 * your start folder for your web application is src/
 * in src2/main/java are located the Java files and in src2/main/resources/ is the blueprint located
 * with ```yarn start``` you can run your application due runtime in your application folder
 * by default this will run on http://localhost:3100/index.html
 * if you have added new dependencies you have to run ```lerna bootstrap``` in odlux/
 * build your app for development version you can use ```yarn run build``` or ```yarn run build:dev``` 
 * build for karaf with ```mvn clean install```


## Including app into karaf environment

 * copy maven repository files to karaf repository e.g.: ```cp ~/.m2/repository/path/of/groupId/artifactId $KARAF_HOME/system/path/of/groupId/```
 * check if odlux-core is started in karaf console: ```feature:list | grep odlux```
 * if not install: ```sdnr-wt-odlux-core-feature```
 * start your app in karaf console: ```bundle:install -s mvn:<groupId>/<artifactId>/<version>```

## Including into ONAP sdnc docker container

 * add maven module to odlux/pom.xml
 * add dependency to odlux/apps/app-feature/pom.xml and odlux/apps/app-installer/pom.xml
 * build odlux/pom.xml
 * this will automatically package your app into the packaged zip file of the installer

## Details

### Default menu positions

 * from 0 for top to 999 for bottom.
```
0	Connect
10	Fault
20	Maintenance
30	Configuration
40	Protection
50	Performance
60	Security
70	Inventory
80	Topology
90	Mediator
100	Help
```

### blueprint.xml

```
<blueprint xmlns="http://www.osgi.org/xmlns/blueprint/v1.0.0">
    <reference id="loadersvc" availability="mandatory" activation="eager" interface="org.onap.ccsdk.features.sdnr.wt.odlux.model.bundles.OdluxBundleLoader"/>
    <bean id="bundle" init-method="initialize" destroy-method="clean" class="org.onap.ccsdk.features.sdnr.wt.odlux.bundles.MyOdluxBundle">
        <property name="loader" ref="loadersvc"/>
        <property name="bundleName" value="demoApp"/>
        <property name="index" value="999"/>
    </bean>
</blueprint>
```
 * bundleName defines the applicationName => default javascript file: <applicationName>.js
 * index defines the menu position.

### MyOdluxBundle.java

 * is just for getting access to the resources of its bundle (implemented because of OSGi access restrictions)

### pom.xml

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <parent>
        <groupId>org.onap.ccsdk.parent</groupId>
        <artifactId>odlparent</artifactId>
        <version>1.2.1-SNAPSHOT</version>
        <relativePath />
    </parent>
    <modelVersion>4.0.0</modelVersion>
    <groupId>org.onap.ccsdk.features.sdnr.wt</groupId>
    <artifactId>sdnr-wt-odlux-app-demoApp</artifactId>
    <version>0.4.1-SNAPSHOT</version>
    <packaging>bundle</packaging>
    <name>sdnr-wt-odlux-app-demoApp</name>
    <licenses>
        <license>
            <name>Apache License, Version 2.0</name>
            <url>http://www.apache.org/licenses/LICENSE-2.0</url>
        </license>
    </licenses>
    <dependencies>
        <dependency>
            <groupId>${project.groupId}</groupId>
            <artifactId>sdnr-wt-odlux-core-model</artifactId>
            <version>${project.version}</version>
        </dependency>
        <dependency>
            <groupId>${project.groupId}</groupId>
            <artifactId>sdnr-wt-odlux-core-provider</artifactId>
            <version>${project.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <build>
        <sourceDirectory>src2/main/java</sourceDirectory>
        <plugins>
            <plugin>
                <artifactId>maven-clean-plugin</artifactId>
                <configuration>
                    <filesets>
                        <fileset>
                            <directory>dist</directory>
                            <followSymlinks>false</followSymlinks>
                        </fileset>
                        <fileset>
                            <directory>node</directory>
                            <followSymlinks>false</followSymlinks>
                        </fileset>
                        <fileset>
                            <directory>node_modules</directory>
                            <followSymlinks>false</followSymlinks>
                        </fileset>
                        <fileset>
                            <directory>../node_modules</directory>
                            <followSymlinks>false</followSymlinks>
                        </fileset>
                    </filesets>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>build-helper-maven-plugin</artifactId>
                <executions>
                    <execution>
                        <id>add-test-source</id>
                        <phase>generate-test-sources</phase>
                        <goals>
                            <goal>add-test-source</goal>
                        </goals>
                        <configuration>
                            <sources>
                                <source>src2/test/java</source>
                            </sources>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>com.github.eirslett</groupId>
                <artifactId>frontend-maven-plugin</artifactId>
                <version>1.8-SNAPSHOT</version>
                <executions>
                    <execution>
                        <id>install node and yarn</id>
                        <goals>
                            <goal>install-node-and-yarn</goal>
                        </goals>
                        <!-- optional: default phase is "generate-resources" -->
                        <phase>initialize</phase>
                        <configuration>
                            <nodeVersion>v8.10.0</nodeVersion>
                            <yarnVersion>v1.12.3</yarnVersion>
                        </configuration>
                    </execution>
                    <execution>
                        <id>yarn build</id>
                        <goals>
                            <goal>yarn</goal>
                        </goals>
                        <configuration>
                            <arguments>run build</arguments>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
            </plugin>
            <plugin>
                <groupId>org.apache.felix</groupId>
                <artifactId>maven-bundle-plugin</artifactId>
                <extensions>true</extensions>
                <configuration>
                    <instructions>
                        <Import-Package>org.onap.ccsdk.features.sdnr.wt.odlux.model.*,com.opensymphony.*</Import-Package>
                        <Private-Package></Private-Package>
                    </instructions>
                </configuration>
            </plugin>
        </plugins>
        <resources>
            <resource>
                <directory>dist</directory>
                <targetPath>odlux</targetPath>
            </resource>
            <resource>
                <directory>src2/main/resources</directory>
            </resource>
            <resource>
                <directory>src2/test/resources</directory>
            </resource>
        </resources>
    </build>
    <pluginRepositories>
        <pluginRepository>
            <id>highstreet repo</id>
            <url>https://cloud-highstreet-technologies.com/mvn/</url>
            <snapshots>
                <enabled>true</enabled>
                <updatePolicy>always</updatePolicy>
            </snapshots>
        </pluginRepository>
    </pluginRepositories>
</project>
your
```

* a modified frontend-maven-plugin installs node, yarn and (optionally lerna) to compile the typescript sources to javascript. These will be build into the dist folder.

