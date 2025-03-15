# Battleship Game - Compilation & Execution Guide
## Introduction
*This document provides a structured guide for compiling, testing, and executing the Battleship game project using Java under a Linux environment. It includes commands for setting up the classpath, compiling Java files, running tests, and generating executable JAR archives.*

## Environment Setup

**Before running any compilation or execution commands, set the classpath:**
`export CLASSPATH="src:classes"`

## Compilation and Execution Commands
1. Javadoc Generation  

|Action|Command|
|------|-------|
|Generate Javadoc for the package and sub-packages|`javadoc -d docs -subpackages battleship`|
|Open the documentation|Open `docs/index.html`|

2. Compilation of Classes  

|Action|Command|
|------|-------|
|Compile all Java files in the battleship package|`javac -d classes src/battleship/*.java`|  


