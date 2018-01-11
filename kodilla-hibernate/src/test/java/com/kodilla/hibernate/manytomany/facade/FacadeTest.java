package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTest {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    Facade facade;

    @Test
    public void getCompanyLike() throws FinderException {
        //Given
        Employee smith = new Employee("John", "Smith");
        Employee jackson = new Employee("Jack", "Jackson");
        Employee white = new Employee("Walter", "White");
        Employee black = new Employee("Andrew", "Black");

        Company nice = new Company("Nice");
        Company bad = new Company("Bad");

        nice.getEmployees().add(smith);
        nice.getEmployees().add(jackson);
        bad.getEmployees().add(white);
        bad.getEmployees().add(black);

        companyDao.save(nice);
        companyDao.save(bad);

        employeeDao.save(smith);
        employeeDao.save(jackson);
        employeeDao.save(white);
        employeeDao.save(black);

        int smithId = smith.getId();
        int jacksonId = jackson.getId();
        int whiteId = white.getId();
        int blackId = black.getId();

        //When
        List<Company> companies = facade.getCompaniesLike("%a%");

        //Then
        try {
            assertEquals(companies.size(), 1);
        } finally {
            //CleanUp
            companyDao.delete(nice);
            companyDao.delete(bad);
            employeeDao.delete(smithId);
            employeeDao.delete(jacksonId);
            employeeDao.delete(whiteId);
            employeeDao.delete(blackId);
        }
    }

    @Test
    public void getEmployeeLike() throws FinderException {
        //Given
        Employee smith = new Employee("John", "Smith");
        Employee jackson = new Employee("Jack", "Jackson");
        Employee white = new Employee("Walter", "White");
        Employee black = new Employee("Andrew", "Black");

        Company nice = new Company("Nice");
        Company bad = new Company("Bad");

        nice.getEmployees().add(smith);
        nice.getEmployees().add(jackson);
        bad.getEmployees().add(white);
        bad.getEmployees().add(black);

        companyDao.save(nice);
        companyDao.save(bad);

        employeeDao.save(smith);
        employeeDao.save(jackson);
        employeeDao.save(white);
        employeeDao.save(black);

        int smithId = smith.getId();
        int jacksonId = jackson.getId();
        int whiteId = white.getId();
        int blackId = black.getId();

        //When
        List<Employee> employees = facade.getEmployeesLike("%a%");
        //Then
        try {
            assertEquals(employees.size(), 2);
        } finally {
            //CleanUp
            companyDao.delete(nice);
            companyDao.delete(bad);

            employeeDao.delete(smithId);
            employeeDao.delete(jacksonId);
            employeeDao.delete(whiteId);
            employeeDao.delete(blackId);
        }
    }
}