package com.example.coding;

public class Employee {
    private Long employeeId;
    private String employeeName;
    private String groupId;
    private String salary;

    public Employee() {

    }

    public Employee(Long employeeId, String employeeName, String groupId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.groupId = groupId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}



