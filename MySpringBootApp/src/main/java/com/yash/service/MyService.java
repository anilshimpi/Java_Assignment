package com.yash.service;

import java.util.List;

import com.yash.model.Department;


public interface MyService {

	Department saveDepartment(Department department);

	List<Department> fetchDepartmentList();

	Department updateDepartment(Department department, Long departmentId);

	void deleteDepartmentById(Long departmentId);

	Department fetchSingleData(Long departmentId);

	

}
