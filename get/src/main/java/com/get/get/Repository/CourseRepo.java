package com.get.get.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.get.get.model.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {
  
}
