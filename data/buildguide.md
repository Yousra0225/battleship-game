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

3. Runing Tests  

|Action|Command|
|------|-------|
|Compile test files|`javac -classpath test4poo.jar ./test/battleship/*.java`|
|Run ![ShipTest](../test/battleship/ShipTest.java)|`java -jar test4poo.jar battleship.ShipTest`|
|Run ![CellTest](../test/battleship/CellTest.java)|`java -jar test4poo.jar battleship.CellTest`|
|Run ![SeaTest](../test/battleship/SeaTest.java)|`java -jar test4poo.jar battleship.SeaTest`|  

4. Running Main Programs  

|Action|Command|
|------|-------|
|Run ![FirstBattleShipMain](../src/battleship/FirstBattleShipMain.java)|`java battleship.FirstBattleShipMain`|
|Run [SecondBattleShipMain](../src/battleship/SecondBattleShipMain.java)|`java battleship.SecondBattleShipMain`|
|Run [ThirdBattleShipMain](../src/battleship/ThirdBattleShipMain.java)|`java battleship.ThirdBattleShipMain`|  

5. Creating and Running JAR Files

|Action|Command|
|------|-------|
|Create `JAR` for `SecondBattleShipMain`|`jar cvfe SecondBattleShipMain.jar battleship.SecondBattleShipMain -C classes battleship`|
|Execute ![SecondBattleShipMain.jar](../SecondBattleShipMain.jar)|`java -jar SecondBattleShipMain.jar`|
|Create `JAR` for `ThirdBattleShipMain`|`jar cvfe ThirdBattleShipMain.jar battleship.ThirdBattleShipMain -C classes battleship`|
|Execute ![ThirdBattleShipMain.jar](../ThirdBattleShipMain.jar)|`java -jar ThirdBattleShipMain.jar`|






