package com.wipro.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	List<Employee> findByWorkLocation(@Param("workLocation") String workLocation);
	
	List<Employee> findByFirstName(@Param("firstName") String firstName);
}