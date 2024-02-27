package net.javaguides.emsbackend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    // Build get Employee rest API

    @GetMapping("{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById (@PathVariable("id") long employeeId){
        EmployeeDTO employee = employeeService.getEmployeeById(employeeId);

        return ResponseEntity.ok(employee);
    }

    // Build get all employee Rest API

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees(){
        List<EmployeeDTO> employees = employeeService.getAllEmployees();

        return ResponseEntity.ok(employees);
    }
}
