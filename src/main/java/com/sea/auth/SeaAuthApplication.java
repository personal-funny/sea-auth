package com.sea.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan({"com.sea.auth"})
public class SeaAuthApplication {
  public static void main(String[] args) {
    SpringApplication.run(SeaAuthApplication.class, args);
  }
}
