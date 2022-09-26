package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Department;
import com.yash.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	MyService service;
	
	@PostMapping("/savedepartments")
    public Department saveDepartment(@RequestBody Department department)
    {
        return service.saveDepartment(department);
    }
 
    
    @GetMapping("/fetchAlldepartments")
    public List<Department> fetchDepartmentList()
    {
        return service.fetchDepartmentList();
    }
 
    @GetMapping(path="/Allfetchdepartments",produces = "Application/xml" )
    public List<Department> fetchAllDepartmentList()
    {
        return service.fetchDepartmentList();
    }
    @GetMapping("/fetchsingledepartments/{id}")
    public Department fetchDepartmentList(@PathVariable("id") Long departmentId)
    {
    	return service.fetchSingleData(departmentId);
          
    }
    // Update operation
    @PutMapping("/updatedepartments/{id}")
    public Department updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        return service.updateDepartment(
            department, departmentId);
    }
 
    // Delete operation
    @DeleteMapping("/deletedepartments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId)
    {
        service.deleteDepartmentById(departmentId);
        return "Deleted Successfully";
    }

}
