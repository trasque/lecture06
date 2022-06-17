package com.raisetech.lecture06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lecture06Controller {

  @GetMapping("/hello")
  public String hello(@RequestParam(defaultValue = "0") String requestParam, Model model) {
    Map<Integer, String> messageMap = new HashMap<>();
    messageMap.put(0, "ハロー！そして");
    messageMap.put(1, "グッドバイ！！");
    messageMap.put(2, "ハロー！そして");
    messageMap.put(3, "グッドバイ？");
    messageMap.put(4, "ハロー？？");
    messageMap.put(5, "グッドバイ……？したいのかい？");
    messageMap.put(6, "ハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハローハロー");
    messageMap.put(7, "こんどこそさようなら");
    messageMap.put(8, "おしまい");

    int nextMapParamNumber;
    String responseMessage;
    if (requestParam.matches("[0-8]")) {
      nextMapParamNumber = Integer.valueOf(requestParam);
      responseMessage = messageMap.get(nextMapParamNumber);
    } else {
      nextMapParamNumber = 0;
      responseMessage = messageMap.get(nextMapParamNumber);
    }

    nextMapParamNumber += 1;
    if (nextMapParamNumber == 9) nextMapParamNumber = 0;
    model.addAttribute("responseMessage", responseMessage);
    model.addAttribute("responseSetParamNumber", nextMapParamNumber);
    return "hello";
  }
}
