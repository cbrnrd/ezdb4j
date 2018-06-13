![ezdb4j-logo](https://i.imgur.com/JWfljkT.png)

# ezdb4j
[![Donations Badge](https://yourdonation.rocks/images/badge.svg)](https://carterbrainerd.me/donations)
[![Build Status](https://travis-ci.org/cbrnrd/ezdb4j.svg?branch=master)](https://travis-ci.org/cbrnrd/ezdb4j)
[ ![Download](https://api.bintray.com/packages/cbrnrd/ezdb4j/ezdb4j/images/download.svg) ](https://bintray.com/cbrnrd/ezdb4j/ezdb4j/_latestVersion)

## Introduction

The Java library for communicating with the ezdb daemon.

## Code Samples

```java
import io.codepace.ezdb4j.*;

// Create a new connection to the ezdb daemon
EzdbConnection connection = EzdbConnector.createConnection();

// Get the value of key and store it as a String
String value = connection.get("keyvalue");

// Kill the connection
connection.terminate();
```

## Installation

### Maven (pom.xml)

```xml
<dependency>
  <groupId>io.codepace</groupId>
  <artifactId>ezdb4j</artifactId>
  <version>0.1.1</version>
  <type>pom</type>
</dependency>
```

### Gradle (build.gradle)
```groovy
repositories {
    jcenter()
}

dependencies {
    compile 'io.codepace:ezdb4j:0.1.1'
}
```

### Ivy
```xml
<dependency org='io.codepace' name='ezdb4j' rev='0.1.1'>
  <artifact name='ezdb4j' ext='pom' ></artifact>
</dependency>
```
