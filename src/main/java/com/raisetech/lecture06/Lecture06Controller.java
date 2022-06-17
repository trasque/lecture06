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
  public String hello(
      @RequestParam(defaultValue = "0") String requestParam,
      Model model) {
    
    String responseMessage;
    Integer massageIndex;
    int responseSetParamNumber;
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

    if (requestParam.matches("[0-8]")) {
      massageIndex = Integer.valueOf(requestParam);
      responseSetParamNumber = massageIndex.intValue();
      responseMessage = messageMap.get(responseSetParamNumber);
    } else {
      responseSetParamNumber = 0;
      responseMessage = messageMap.get(responseSetParamNumber);
    }

    responseSetParamNumber += 1;
    if (responseSetParamNumber == 9) responseSetParamNumber = 0;
    model.addAttribute("responseMessage", responseMessage);
    model.addAttribute("responseSetParamNumber", responseSetParamNumber);
    return "hello";
  }
}
