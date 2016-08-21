package com.levelup.lesson7.testMock;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CompanyTest {


    private Company company = new Company();

    @Mock
    ArrayList<Employee> employees;

    @Mock
    DataDAO dataDAO;

    @Before
    public void setUp() {
        when(employees.add(any())).thenReturn(true);
        when(dataDAO.add(any())).thenReturn(true);

        company.setEmployees(employees);
        company.setDataDAO(dataDAO);

    }

    @Test
    public void testAddEmployee() {

        Employee newEmployee = new Employee("Vasya", 0);
        company.addEmployee(newEmployee);
        verify(employees, times(1)).add(any());
        verify(dataDAO, times(1)).add(any());

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhileAddExistingEmployee() {
        try {
            //GIVEN
            Employee newEmployee = new Employee("Vasya", 0);
            when(employees.contains(newEmployee)).thenReturn(true);
            //WHEN
            company.addEmployee(newEmployee);
            //THEN
        } finally {


            verify(employees, times(0)).add(any());
            verify(dataDAO, times(1)).add(any());
        }

    }


}
