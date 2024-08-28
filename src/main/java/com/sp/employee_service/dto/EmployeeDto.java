package com.sp.employee_service.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int departmentID;
}
