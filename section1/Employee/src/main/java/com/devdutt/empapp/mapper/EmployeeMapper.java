package com.devdutt.empapp.mapper;

import com.devdutt.empapp.dto.EmployeeDTO;
import com.devdutt.empapp.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public EmployeeDTO toDTO(Employee employee) {
        return new EmployeeDTO(employee.getId(), employee.getName(),
                employee.getEmail(), employee.getAddress(), employee.getPhone());

    }

    public Employee toEntity(EmployeeDTO employeeDto) {
        return new Employee(employeeDto.getId(), employeeDto.getName(),
                employeeDto.getEmail(), employeeDto.getAddress(), employeeDto.getPhone());


    }

}
