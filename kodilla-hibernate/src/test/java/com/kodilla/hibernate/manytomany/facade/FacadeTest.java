package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
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
    private CompanyDao companyDao;

//    @Autowired
//    private EmployeeDao employeeDao;

    @Test
    public void getCompanyLike() {
        //Given
        Employee smith = new Employee("John", "Smith");
        Employee jackson = new Employee("Jack", "Jackson");

        Company nice = new Company("Nice");
        Company bad = new Company("Bad");

        nice.getEmployees().add(smith);
        nice.getEmployees().add(jackson);

        bad.getEmployees().add(smith);
        bad.getEmployees().add(jackson);

        companyDao.save(nice);
        companyDao.save(bad);

        //When
        List<Company> companyList = companyDao.retrieveByLetter();

        //Then
        try {
            assertEquals(companyList.size(), 1);
        } finally {
            //CleanUp
            companyDao.delete(nice);
            companyDao.delete(bad);
        }
    }

//    @Test
//    public void getCompaniesLike() throws Exception {
//    }

}