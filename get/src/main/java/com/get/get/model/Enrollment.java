package com.get.get.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "enrollment")
public class Enrollment {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long enroll_Id;

  @ManyToOne
  @JoinColumn(name = "student_Id", nullable = false)
  private Student student;

  @ManyToOne
  @JoinColumn(name = "course_id", nullable = false)
  private Course course;

  private LocalDate enrollmentDate;
}
