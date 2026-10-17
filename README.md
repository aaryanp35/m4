# Refactoring Mini Assignment (Java)

This is a CSC207 (Software Design, University of Toronto) mini assignment.

## What it does

- Prints a plain-text statement for a theater invoice: each performance, the amount owed, and the volume credits earned.
- Refactors `StatementPrinter` following the first chapter of Martin Fowler's *Refactoring*, translated to Java. The long statement method is split into helpers such as `getAmount`, `getVolumeCredits`, and `usd`.
- Uses named constants from `Constants` for pricing and credit thresholds.

## Key concepts

- Behavior-preserving refactoring, guided by tests
- Extract method, rename, and inline variable refactorings in IntelliJ
- Code style checks with Checkstyle
- Recording a commit for each task in `log.txt`

## Supporting material

- `walkthrough.md` has short animations of the main refactoring steps.
- `chapter13-refactoring.md` summarizes common refactoring techniques.

## Running the tests

From the project root (JDK 11 or newer, with Maven):

    mvn test

Status: `StatementPrinterTests` pass. `NewPlayTypeTests` still fails because the new `history` play type is not implemented yet.

---

Course starter code provided by the CSC207 teaching team; implementation by Aaryan Patel.
