package com.cj.authentication.token.sampleconsumer;

import com.cj.authentication.Token;
import com.cj.authentication.TokenVerifier;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("usage: authentication-token-sample-consumer <secret> <token>");
      System.exit(1);
    }
    Optional<Token> token = TokenVerifier.verifyTokenString(args[0], args[1]);
    if (token.isPresent()) {
      System.out.println(token.get());
    } else {
      System.err.println("invalid token");
      System.exit(1);
    }
  }
}
