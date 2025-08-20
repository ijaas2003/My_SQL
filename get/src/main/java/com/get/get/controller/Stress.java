package com.get.get.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.get.get.Service.StressService;

@RestController
@RequestMapping("/stress")
public class Stress {
  private StressService stressService;
  public Stress(StressService stressService) {
    this.stressService = stressService;
  }
  private static final String START = "start";
  @GetMapping("/stressTest")
  public String stressTest(@RequestParam String test) {
    String result = null;
    if (test.equalsIgnoreCase(START)) {
      result = stressService.getData();
    }
    return result;
  }
}