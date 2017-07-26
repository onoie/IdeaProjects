# XLibrary
author ymst180
## Usage
```
    <properties>
        <endorsed.dir>${project.build.directory}/endorsed</endorsed.dir>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <java.version>1.8</java.version>
    </properties>

    <repository>
        <id>local</id>
        <url>file:${basedir}/src/lib</url>
    </repository>
    
    <dependencies>
        <!-- local repository -->
        <dependency>
            <groupId>com.ymst180</groupId>
            <artifactId>xlibrary</artifactId>
            <version>RELEASE</version>
            <scope>system</scope>
            <systemPath>${basedir}/lib/xlibrary.jar</systemPath>
        </dependency>
    <dependencies>
```