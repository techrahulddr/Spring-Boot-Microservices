package com.devdutt.empapp.service.impl;

import com.devdutt.empapp.dto.EmployeeDTO;
import com.devdutt.empapp.entity.Employee;
import com.devdutt.empapp.mapper.EmployeeMapper;
import com.devdutt.empapp.repository.EmployeeRepository;
import com.devdutt.empapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDto) {
        Employee employee = employeeMapper.toEntity(employeeDto);
        employee = employeeRepository.save(employee);
        return employeeMapper.toDTO(employee);
    }


    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
        return employeeMapper.toDTO(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll()
                .stream().map(employeeMapper::toDTO)
                .collect(Collectors.toList());

    }

    @Override
    public EmployeeDTO UpdateEmployee(Long id, EmployeeDTO employeeDto) {
        Employee Existingemployee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
        //Existingemployee.setId(employeeDto.getId());
        Existingemployee.setName(employeeDto.getName());
        Existingemployee.setEmail(employeeDto.getEmail());
        Existingemployee.setAddress(employeeDto.getAddress());
        Existingemployee.setPhone(employeeDto.getPhone());
        Employee Updatedemployee = employeeRepository.save(Existingemployee);

        return employeeMapper.toDTO(Updatedemployee);
    }

    @Override
    public void deleteEmployee(Long id) {
        Employee ExistingEmp = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
        employeeRepository.deleteById(id);

    }
}
