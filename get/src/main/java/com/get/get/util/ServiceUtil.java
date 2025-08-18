package com.get.get.util;

import com.get.get.api.StressAPI;

public class ServiceUtil implements StressAPI {
  @Override
  public String getData() {
    System.out.println("ServiceUtil: Processing getData with request: ");
    return "Processed data retrieval";
  }
  @Override 
  public String updateData(String requestBody) {
    System.out.println("ServiceUtil: Processing updateData with request: " + requestBody);
    return "Processed data update";
  }

  public Long getRandomNumber (Long lastId) {
    if (lastId == 0) {
      return 1000000000L;
    }
    return lastId + 1;
  }
}
