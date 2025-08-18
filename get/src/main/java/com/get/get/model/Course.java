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
@Table(name = "courses")
public class Course {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long column_id;

  @Column(nullable = false)
  private String courseName;

  @Column(nullable = false)
  private Integer credits;

  @ManyToOne
  @JoinColumn(name = "dept_id")
  private Department departId;

  @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
  private List<Enrollment> enrollments;
  
  public Long getColumnId() {
    return this.column_id;
  }
  public void setColumnId(Long column_id) {
    this.column_id = column_id;
  }
  public String getCourseName() {
    return this.courseName;
  }
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }
  public Integer getCredits() {
    return this.credits;
  }
  public void setCredits(Integer credits) {
    this.credits = credits;
  }
  public Department getDepartment() {
    return this.departId;
  }
  public void setDepartment(Department departId) {
    this.departId = departId;
  }
}
