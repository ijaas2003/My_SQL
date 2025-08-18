package com.get.get.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.get.get.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
