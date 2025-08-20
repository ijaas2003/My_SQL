package com.get.get.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.get.get.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {}
