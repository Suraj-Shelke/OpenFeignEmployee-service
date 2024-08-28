package com.sp.employee_service.service;

import com.sp.employee_service.dao.EmployeeRepository;
import com.sp.employee_service.dto.DepartmentDto;
import com.sp.employee_service.dto.EmployeeDto;
import com.sp.employee_service.dto.ResponseDto;
import com.sp.employee_service.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private APIClient apiClient;

        public Employee addEmployee(Employee employee)
        {
            return employeeRepository.save(employee);
        }
        public ResponseDto getEmployeeById(int id)
        {

            Employee employee=employeeRepository.findById(id).get();

            EmployeeDto employeeDto=new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.getDepartmentID());
            DepartmentDto departmentDto= apiClient.getDepartmentById(employee.getDepartmentID());

            return new ResponseDto(employeeDto,departmentDto);
        }
        public List<Employee> getEmployee()
        {
            return employeeRepository.findAll();
        }




}
