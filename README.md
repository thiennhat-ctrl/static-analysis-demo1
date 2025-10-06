# Lab: Static Analysis Demo (Java)

This mini project shows typical static-analysis findings and fixes.

## Files
- `TransactionProcessor.java`: buggy code (high cyclomatic complexity, unused variable, buffer overflow risk, dead code).
- `TransactionProcessorRefactored.java`: fixed code.
- `Transaction.java`: simple data model.
- `sonar-project.properties`: sample config if you run `sonar-scanner`.
- `pom.xml`: minimal Maven build file.

## Build
```bash
mvn -q -DskipTests package
```

## Run Sonar (optional)
Install SonarQube & sonar-scanner locally, then run:
```bash
sonar-scanner
```
Open Sonar dashboard to inspect findings.
