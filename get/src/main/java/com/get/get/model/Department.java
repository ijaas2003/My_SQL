package com.get.get.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {
  
  @Id
  @Column(length = 10)
  private Long deptId;

  @Column(nullable = false, unique = true)
  private String deptName;
  
}
