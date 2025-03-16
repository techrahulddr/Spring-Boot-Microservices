package com.devdutt.empapp.service;

import com.devdutt.empapp.dto.EmployeeDTO;

import java.util.List;

public interface  EmployeeService {
    EmployeeDTO createEmployee(EmployeeDTO employeeDto);
    EmployeeDTO getEmployeeById(Long id);
    List<EmployeeDTO> getAllEmployees();
    EmployeeDTO UpdateEmployee(Long  id, EmployeeDTO employeeDto);
    void deleteEmployee(Long id);
}
