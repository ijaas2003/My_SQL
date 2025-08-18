package com.get.get.util;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;

import com.get.get.Repository.CourseRepo;
import com.get.get.Repository.DepartmentRepo;
import com.get.get.model.Course;
import com.get.get.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StressMySql {
  @Autowired
  private CourseRepo courseRepo;

  @Autowired
  private DepartmentRepo departmentRepo;

  public AtomicLong QPS = new AtomicLong(0);

  Supplier<String> courseSupplier = () -> {
    Long departId = 0L;
    for (int i = 1; i <= 20; i++) {
      String courseName = "course" + i;
      if (i % 4 == 0) {
        departId += 1;
      }
      Course course = new Course();
      // Fetch department by id (or create if not found)
      Department department = departmentRepo.findById(departId).orElse(null);
      course.setCourseName(courseName);
      course.setCredits(i);
      course.setDepartment(department);
      courseRepo.save(course);
      QPS.incrementAndGet();
    }
    return null;
  };

  //suppiler for department
  Supplier<Void> departmentSuppiler = () -> {
    for (int i = 0; i < 4; i++) {
      Department department = new Department();
      department.setDeptName("Department" + i);
      departmentRepo.save(department);
      QPS.incrementAndGet();
    }
    return null;
  };


}
