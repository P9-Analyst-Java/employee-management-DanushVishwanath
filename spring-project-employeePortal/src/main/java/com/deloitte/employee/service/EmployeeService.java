package com.deloitte.employee.service;

import java.util.List;

import com.deloitte.employee.model.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	void save(Employee employee);
	
	Employee findById(Long empId);
	void delete(Long empId);
}