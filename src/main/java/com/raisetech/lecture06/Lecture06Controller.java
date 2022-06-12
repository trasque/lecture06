package com.raisetech.lecture06;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lecture06Controller {

  @GetMapping("/hello")
  public String greetings() {
    return "Hello, world!";
  }
  
}
