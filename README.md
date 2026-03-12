# Jenkins Shared Library

This directory contains reusable pipeline code for **Jenkins Shared Libraries**. Shared libraries help avoid repeating the same pipeline logic across multiple Jenkins pipelines.

## Purpose

The shared library stores common pipeline functions such as build, test, deploy, or utility scripts that can be reused in different Jenkins projects.

## Structure

```
shared-library
│
├── vars/
│   └── example.groovy      # Global pipeline functions
│
├── src/
│   └── org/example/Utils.groovy   # Groovy helper classes
│
└── resources/
    └── config.yaml         # Optional resource files
```

## Usage in Jenkinsfile

To use the shared library in a pipeline:

```
@Library('Shared') _
```

```

## Configuration

The shared library must be configured in **Jenkins → Manage Jenkins → Configure System → Global Pipeline Libraries**.

* **Name:** Shared
* **Default Version:** main
* **Source Code Management:** Git repository containing this library

Once configured, Jenkins pipelines can reuse functions from this library.
