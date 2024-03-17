package com.wipro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.dao.EmployeeRepository;
import com.wipro.exception.CustomEmployeeException;
import com.wipro.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository emplrepo;

	@Override
	public List<Employee> getAll() {

		return emplrepo.findAll();
	}

	@Override
	public Employee getById(int id) {

		Optional<Employee> optionalEmployee = emplrepo.findById(id);
		if (optionalEmployee.isPresent()) {

			return optionalEmployee.get();
		} else {
			throw new CustomEmployeeException.EmployeeNotFoundException("No Employee Found of ID : " + id);
		}
	}

	@Override
	public List<Employee> getByWorkLocation(String workLocation) {

		List<Employee> empList = emplrepo.findByWorkLocation(workLocation);

		if (!empList.isEmpty()) {

			return empList;
		}

		else {
			throw new CustomEmployeeException.EmployeeNotFoundException("No Employee found by the Worklocation");
		}

	}

	@Override
	public List<Employee> getByFirstName(String firstName) {

		List<Employee> empList = emplrepo.findByFirstName(firstName);

		if (!empList.isEmpty()) {

			return empList;
		}

		else {
			throw new CustomEmployeeException.EmployeeNotFoundException("No Employee found by the firstName " + firstName);
		}

	}

	@Override
	public void updateEmployee(Employee employee) {

		if (emplrepo.existsById(employee.getId())) {
			emplrepo.save(employee);
		} else {
			throw new CustomEmployeeException.EmployeeNotFoundException("Employee not found");
		}

	}

	@Override
	public void deleteEmployee(int id) {

		//System.out.println("id to delete" + id);
		if (emplrepo.existsById(id)) {
			
		}
		else
		throw new CustomEmployeeException.EmployeeDeleteException("Deletion was unsuccessfulfor id : " + id + " please check id");

	}

	@Override
	public void addNewEmployee(Employee employee) {

		emplrepo.save(employee);
	}

}
