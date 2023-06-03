# String Case Converter - still wip

## Description

This is a console-based application that converts strings into various case formats, including camelCase, snake_case,
and sArCaSm CaSe.

## Dependencies

This project utilizes the following dependencies:

- JUnit Jupiter: A testing framework for writing and executing tests.
- Mockito JUnit Jupiter: A mocking framework for creating and verifying mocks in tests.

## Prerequisites

To run this application on your system, please ensure the following:

- Java 17 or a higher version is installed on your laptop.
- Apache Maven is installed on your system.

```xml
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>{jdk version on your machine}</maven.compiler.source>
    <maven.compiler.target>{jdk version on your machine}</maven.compiler.target>
</properties>
```

## Usage

1. Clone the repository: `git clone https://github.com/reimiii/string-case-converter.git`
2. Navigate to the project directory: `cd string-case-converter`
3. Build the project using Maven: `mvn clean install` or `mvn clean package assembly:single` (both commands are
   equivalent for now).
4. Run the application: `java -jar target/string-case-converter-1.0-SNAPSHOT.jar` or `java -jar target/string-case-converter-1.0-SNAPSHOT-jar-with-dependencies.jar`  if available.

```
# The following output is hard-coded from Main-Class: franxx.code.reimiii.App

Original input: Shadow Lady Portwave

camelCase: shadowLadyPortwave
snake_case: shadow_lady_portwave
sArCaSm CaSe: sHaDoW LaDy pOrTwAvE
```

## Future Work

- Addition of support for additional case formats.
- Enhancement of error handling and input validation.
- Improved console appearance.
- Assistance with version control.
- Service testing.

## Contributions

Contributions are welcome! If you would like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/your-feature`
3. Make your changes and commit them: `git commit -m 'Add your feature'`
4. Push to the branch: `git push origin feature/your-feature`
5. Submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).