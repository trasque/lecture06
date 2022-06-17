package com.raisetech.lecture06;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lecture06Controller {

  @GetMapping("/hello")
  public String hello() {
    return "<a href=\"/bye\">ハロー！そして</a>";
  }
  
  @GetMapping("/bye")
  public String bye() {
    return "<a href=\"/hello2\">グッドバイ！！</a>";
  }

  @GetMapping("/hello2")
  public String hello2() {
    return "<a href=\"/bye2\">ハロー！そして</a>";
  }

  @GetMapping("/bye2")
  public String bye2() {
    return "<a href=\"/hello3\">グッドバイ？</a>";
  }

  @GetMapping("/hello3")
  public String hello3() {
    return "<a href=\"bye3\">ハロー？？</a>";
  }

  @GetMapping("/bye3")
  public String bye3() {
    return "グッドバイ……？ <a href=\"hello4\">したいのかい？</a>";
  }

  @GetMapping("/hello4")
  public String hello4() {
    return "<a href=\"bye4\">ハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハロー</a>";
  }

  @GetMapping("/bye4")
  public String bye4() {
    return "<a href=\"byebye\">こんどこそさようなら</a>";
  }

  @GetMapping("/byebye")
  public String byebye() {
    return "おしまい";
  }
}
