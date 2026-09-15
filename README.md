# Ecommerce BDD Test Automation Framework

A separate Selenium and Cucumber BDD project for the same ecommerce website and page-object framework.

## Run

Open PowerShell in this folder:

```powershell
cd C:\Users\HP\Downloads\EcommerceBDDTestAutomationFramework
```

Compile without launching browser scenarios:

```powershell
mvn clean test -DskipTests
```

Run the Cucumber scenarios:

```powershell
mvn clean test
```

The project uses JUnit with Cucumber only. It requires Java, Maven, Google Chrome, and internet access. Browser credentials and the application URL are configured in the existing test resources and step definitions.
