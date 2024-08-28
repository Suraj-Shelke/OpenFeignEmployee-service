package com.sp.employee_service.controller;

import com.sp.employee_service.dto.ResponseDto;
import com.sp.employee_service.model.Employee;
import com.sp.employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api2/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }
    @GetMapping()
    public List<Employee> getEmployee()
    {
        return employeeService.getEmployee();
    }
    @GetMapping(value = "/{id}")
    public ResponseDto getEmployeeById(@PathVariable int id)
    {
        return employeeService.getEmployeeById(id);
    }
}
