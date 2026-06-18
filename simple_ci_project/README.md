# Simple Maven CI Demo

This is a minimal Java + Maven project designed to demonstrate a free CI pipeline using GitHub Actions.

## Features
- Java 17
- Maven build
- JUnit 5 tests
- GitHub Actions CI
- Automatic artifact upload

## Run locally
mvn clean package

## CI Pipeline
The workflow runs automatically on:
- Push to main
- Pull requests targeting main

It performs:
1. Checkout
2. Java setup
3. Maven build + tests
4. Artifact upload
