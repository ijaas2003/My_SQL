package com.get.get.util;

import org.springframework.stereotype.Component;

import com.get.get.api.StressAPI;

@Component
public class ServiceUtil implements StressAPI {

  private StressMySql stressMySql;

  public ServiceUtil(StressMySql stressMySql) {
    this.stressMySql = stressMySql;
  }

  @Override
  public String getData() {
    System.out.println("ServiceUtil: Processing getData with request: ");
    System.out.println("ExecutorService: Started");
    ExicutorServices<Void> executorServices = new ExicutorServices<>();
    executorServices.PreProcesstest(stressMySql.courseSupplier, stressMySql.departmentSuppiler, null, null);
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
