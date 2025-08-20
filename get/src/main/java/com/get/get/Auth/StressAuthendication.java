package com.get.get.Auth;

import org.springframework.stereotype.Component;

import com.get.get.api.StressAPI;
import com.get.get.util.ServiceUtil;

@Component
public class StressAuthendication implements StressAPI {

  private ServiceUtil serviceUtil;

  public StressAuthendication(ServiceUtil serviceUtil) {
    this.serviceUtil = serviceUtil;
  }

  @Override
  public String getData() {
    System.out.println("Authenticating data retrieval with requests: ");
    serviceUtil.getData();
    return "Authenticated data retrieval";
  }
  @Override
  public String updateData(String requestBody) {
    System.out.println("Authenticating data retrieval with request: " + requestBody);
    return "Authenticated data update";
  }

}
