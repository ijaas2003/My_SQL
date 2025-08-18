package com.get.get.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long dept_Id;

  @Column(nullable = false, unique = true)
  private String deptName;
  
  @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
  private List<Student> students;

  @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
  private List<Course> courses;

  public Long getDeptId() {
    return this.dept_Id;
  }

  public void setDeptId(Long dept_Id) {
    this.dept_Id = dept_Id;
  }

  public String getDeptName() {
    return this.deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }
}