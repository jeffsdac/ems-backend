package net.javaguides.emsbackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.javaguides.emsbackend.dto.EmployeeDTO;
import net.javaguides.emsbackend.service.EmployeeService;


@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeControler {

    private EmployeeService employeeService;


    // Build ADD employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO empDTO){
        EmployeeDTO savedEmployee = employeeService.createEmployee(empDTO);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    
}
