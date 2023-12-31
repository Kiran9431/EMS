package com.emp.service;

import com.emp.model.Employee;
import com.emp.response.Response;

public interface EmployeeService {

	Response saveEmployee(Employee employee);

	Response getEmployee(Integer employeeId);

	Response getEmployee1(Integer employeeId);

	Response getAllEmployee1(Integer employeeId);

	Response deleteEmployee(Integer employeeId);

	Response getAllEmployees();

}
