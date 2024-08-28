package com.sp.employee_service.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentDto {
    private int id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
