package com.levelup.lesson7.testMock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 21.08.2016.
 */
public class Company {
    private List<Employee> employees;
    private DataDAO dataDAO;
    private String name;

    public Company() {
        employees = new ArrayList<>();
    }

    public Company(List<Employee> employees, String name) {
        this.employees = employees;
        this.name = name;
    }


    public void setDataDAO(DataDAO dataDAO) {
        this.dataDAO = dataDAO;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addEmployee(Employee employee) {
        dataDAO.add(employee);
        if (employees.contains(employee)) {
            throw new IllegalArgumentException();
        }
        return employees.add(employee);
    }
}
