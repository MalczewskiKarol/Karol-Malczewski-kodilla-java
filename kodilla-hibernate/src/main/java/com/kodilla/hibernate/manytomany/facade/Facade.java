package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Facade {

    @Autowired
    public CompanyDao companyDao;

    @Autowired
    public EmployeeDao employeeDao;

    public List<Employee> getEmployeesLike() {
        List<Employee> employeeList = employeeDao.retrieveByLetter();
        return employeeList;
    }

    public List<Company> getCompaniesLike(String word) {
        List<Company> companyList = companyDao.retrieveByLetter();
        return companyList;
    }
}
