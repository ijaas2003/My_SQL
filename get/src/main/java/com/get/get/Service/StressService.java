package com.get.get.Service;

import org.springframework.stereotype.Service;

import com.get.get.Auth.StressAuthendication;

@Service
public class StressService {

  
  public String getData() {
    StressAuthendication stressAuth = new StressAuthendication();
    stressAuth.getData();
    return "Data retrieved successfully";
  }

  public String updateData(String requestBody) {
    StressAuthendication stressAuth = new StressAuthendication();
    stressAuth.getData();
    return "Data updated successfully";
  }
}
