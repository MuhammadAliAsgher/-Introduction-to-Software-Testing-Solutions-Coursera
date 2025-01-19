# Introduction to Software Testing Course

This repository contains various modules and assignments for the "Intro to Testing" course. Below is the structure and content of each module.

## Module 1

### Files
- [Module 1/DemoTest.java](Module%201/DemoTest.java)

### Description
This module contains a demo test file for basic unit testing using JUnit.

### [Module 1/DemoTest.java](Module%201/DemoTest.java)
This file contains unit tests for the `Demo` class, specifically testing the `isTriangle` method and the `main` method.

## Module 3

### Files
- [Module 3/GolfScore_TestPlan.docx](Module%203/GolfScore_TestPlan.docx)

### Description
This module contains a test plan document for the Golf Score application.

### [Module 3/GolfScore_TestPlan.docx](Module%203/GolfScore_TestPlan.docx)
This file is a Word document outlining the test plan for the Golf Score application.

## Module 4

### Assignment 1

#### Files
- [Module 4/Assignment 1/CoffeeMakerTest.java](Module%204/Assignment%201/CoffeeMakerTest.java)

#### Description
This assignment involves writing unit tests for the `CoffeeMaker` class.

#### [Module 4/Assignment 1/CoffeeMakerTest.java](Module%204/Assignment%201/CoffeeMakerTest.java)
This file contains unit tests for the `CoffeeMaker` class, testing various functionalities such as adding inventory, making coffee, and adding/deleting recipes.

### Assignment 2

#### Files
- [Module 4/Assignment 2/CoffeeMakerTestCheckingCoverageWithJaCoCo.java](Module%204/Assignment%202/CoffeeMakerTestCheckingCoverageWithJaCoCo.java)

#### Description
This assignment focuses on checking code coverage using JaCoCo for the `CoffeeMaker` class.

#### [Module 4/Assignment 2/CoffeeMakerTestCheckingCoverageWithJaCoCo.java](Module%204/Assignment%202/CoffeeMakerTestCheckingCoverageWithJaCoCo.java)
This file contains unit tests for the `CoffeeMaker` class, similar to Assignment 1, but with an emphasis on achieving high code coverage.

### Assignment 3

#### Files
- [Module 4/Assignment 3/CoffeeMakerTestAddingMocksAndStubs.java](Module%204/Assignment%203/CoffeeMakerTestAddingMocksAndStubs.java)

#### Description
This assignment involves adding mocks and stubs to the unit tests for the `CoffeeMaker` class.

#### [Module 4/Assignment 3/CoffeeMakerTestAddingMocksAndStubs.java](Module%204/Assignment%203/CoffeeMakerTestAddingMocksAndStubs.java)
This file contains unit tests for the `CoffeeMaker` class, utilizing mocks and stubs to test interactions with the `RecipeBook` and `Inventory` classes.

## How to Run Tests

To run the tests, you can use any IDE that supports JUnit, such as IntelliJ IDEA or Eclipse. Alternatively, you can run the tests from the command line using Maven or Gradle.

### Using Maven
```sh
mvn test