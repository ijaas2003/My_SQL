package com.get.get.util;

import java.util.function.Supplier;

public class ExicutorServices<T> {
  public void PreProcesstest(Supplier<T> supplierCourse, Supplier<T> department, Supplier<T> student, Supplier<T> enrollment) {
    Long start = System.currentTimeMillis();
    supplierCourse.get();
    
  }
}
