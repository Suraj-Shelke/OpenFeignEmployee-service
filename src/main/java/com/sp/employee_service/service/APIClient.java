package com.sp.employee_service.service;

import com.sp.employee_service.dto.DepartmentDto;
import com.sp.employee_service.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value ="department-service" , url ="http://localhost:8080")
public interface APIClient {
    @GetMapping(value = "/api1/departments/{id}")
    public DepartmentDto getDepartmentById(@PathVariable("id") int departmentId);

}
