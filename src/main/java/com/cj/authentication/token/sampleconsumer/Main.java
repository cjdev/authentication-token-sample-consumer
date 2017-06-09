package com.cj.authentication.token.sampleconsumer;

import com.cj.authentication.Token;
import com.cj.authentication.TokenVerifier;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Main {
  public static void main(String[] args) throws MalformedURLException {
    if (args.length != 1) {
      System.out.println("usage: authentication-token-sample-consumer <token>");
      System.exit(1);
    }
    try (TokenVerifier tokenVerifier = new TokenVerifier(new URL("https://lab-io.d.cjpowered.com/public-keys"))) {
      Optional<Token> token = tokenVerifier.verifyTokenString(args[0]);
      if (token.isPresent()) {
        System.out.println(token.get());
      } else {
        System.err.println("invalid token");
        System.exit(1);
      }
    }
  }
}
