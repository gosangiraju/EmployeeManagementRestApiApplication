package com.gl.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.bean.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

	List<Employee> findAllByFirstName(String firstName);

}
