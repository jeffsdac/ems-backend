package net.javaguides.emsbackend.mapper;

import net.javaguides.emsbackend.dto.EmployeeDTO;
import net.javaguides.emsbackend.entity.Employee;

public class EmployeeMapper {
    
    public static EmployeeDTO mapToEmployeeDto (Employee emp){

        return new EmployeeDTO(
            emp.getId(),
            emp.getFirstName(),
            emp.getLastName(),
            emp.getEmail()
        );
    }

    public static Employee mapToEmployee (EmployeeDTO empDTO) {
        return new Employee(
            empDTO.getId(),
            empDTO.getFirstName(),
            empDTO.getLastName(),
            empDTO.getEmail()
        );
    }
}
