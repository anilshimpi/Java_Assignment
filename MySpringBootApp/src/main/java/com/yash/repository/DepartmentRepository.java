package com.yash.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

	Optional<Department> getBydepartmentId(Long departmentId);
		
}
