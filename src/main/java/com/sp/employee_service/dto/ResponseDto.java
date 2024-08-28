package com.sp.employee_service.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseDto {
    private EmployeeDto employeeDto;
    private DepartmentDto departmentDto;

}
