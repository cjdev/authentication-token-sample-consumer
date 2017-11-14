# authentication-token-sample-consumer

This project implements a tiny sample command-line application that uses the [`com.cj:authentication-token-verifier`][authentication-token-verifier] library to consume and validate CJ OAuth tokens. To build and run the project, you need to have Java and [Maven][maven], then run the following commands:

```
$ mvn clean install
$ java -jar target/authentication-token-sample-consumer-1.0-SNAPSHOT.jar '<some authentication token>'
```

If the token is valid, the application will print the principals inside the token:

```
Token{appId='291tmjr0kc7ps1rah923e8vnqc', userId=Optional[0244b366-e61c-4a87-89a2-822e229ef63e]}
```

Otherwise, if the token is invalid or expired, it will print `invalid token`.

For more information, see the [authentication-token-verifier][] project.

[authentication-token-verifier]: http://gitlab.cj.com/apis-partnerships/authentication-token-verifier
[maven]: http://maven.apache.org
