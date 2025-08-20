package com.get.get.Service;

import org.springframework.stereotype.Service;

import com.get.get.Auth.StressAuthendication;

@Service
public class StressService {
  private final StressAuthendication stressAuth;
  public StressService(StressAuthendication stressAuth) {
        this.stressAuth = stressAuth;
    }

  public String getData() {
    stressAuth.getData();
    return "Data retrieved successfully";
  }

  public String updateData(String requestBody) {
    stressAuth.getData();
    return "Data updated successfully";
  }
}
