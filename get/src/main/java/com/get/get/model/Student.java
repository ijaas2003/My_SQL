package com.get.get.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long student_Id;

  @Column(nullable = false, unique = true)
  private String email;

  @ManyToOne
  @JoinColumn(name = "dept_Id")
  private Department department;

  @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
  private List<Enrollment> enrollments;
}
