package com.yash.serviceimpl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Department;
import com.yash.repository.DepartmentRepository;
import com.yash.service.MyService;

@Service
public class Departmentimpl implements MyService {
	
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		
		List<Department>deptlist=departmentRepository.findAll();
		return deptlist;
	}

	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		// TODO Auto-generated method stub
		
		Department dept = departmentRepository.findById(departmentId).get();
		
		if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
	            dept.setDepartmentName(
	                department.getDepartmentName());
	        }
	 
	        if (Objects.nonNull(
	                department.getDepartmentAddress())
	            && !"".equalsIgnoreCase(
	                department.getDepartmentAddress())) {
	            dept.setDepartmentAddress(
	                department.getDepartmentAddress());
	        }
	 
	        if (Objects.nonNull(department.getDepartmentCode())
	            && !"".equalsIgnoreCase(
	                department.getDepartmentCode())) {
	            dept.setDepartmentCode(
	                department.getDepartmentCode());
	        }
	 
	        return departmentRepository.save(dept);
		
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(departmentId);
	}

	@Override
	public Department fetchSingleData(Long departmentId) {
		// TODO Auto-generated method stub
		Optional<Department> dept=departmentRepository.getBydepartmentId(departmentId);
		
		return dept.get();
	}

	

}
