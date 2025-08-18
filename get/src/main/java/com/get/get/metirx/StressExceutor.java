package com.get.get.metirx;

import com.get.get.util.StressMySql;

public class StressExceutor<T> {
  public void getMetrix () {
    System.out.println("Executing getMetrix in StressExceutor");
    while (true) {
      try {
        Thread.sleep(1000);
        System.out.println("QPS is: " + new StressMySql().QPS.get());
         // Simulate some processing delay
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt(); // Restore interrupted status
        System.out.println("Thread was interrupted, stopping execution.");
        break;
      }
      System.out.println("Processing in StressExceutor...");
    }
  }
}
