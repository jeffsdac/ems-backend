package net.javaguides.emsbackend.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.javaguides.emsbackend.dto.EmployeeDTO;
import net.javaguides.emsbackend.entity.Employee;
import net.javaguides.emsbackend.mapper.EmployeeMapper;
import net.javaguides.emsbackend.repository.EmployeeRepository;
import net.javaguides.emsbackend.service.EmployeeService;


@Service
@AllArgsConstructor
public class EmployeeServiceImp implements EmployeeService{

    private EmployeeRepository employeeRepository;


    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        
        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
    
}
