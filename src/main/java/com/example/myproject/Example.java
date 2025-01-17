/* (C) Private company */
package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(Example.class, args);
  }

  @RequestMapping("/")
  String home() {
    return "Hello World - v3!";
  }
}
