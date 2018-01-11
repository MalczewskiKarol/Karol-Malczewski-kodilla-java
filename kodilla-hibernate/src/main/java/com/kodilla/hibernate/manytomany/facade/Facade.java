package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Facade {
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    @Autowired
    public CompanyDao companyDao;

    @Autowired
    public EmployeeDao employeeDao;

    public List<Employee> getEmployeesLike(String lastName) throws FinderException {
        List<Employee> employeeList = employeeDao.employeeByLetter(lastName);
        if(!employeeList.isEmpty()) {
            LOGGER.info("Employee " + employeeList + "found");
            return employeeList;
        } else {
            LOGGER.error(FinderException.ERR_EMPLOYEE_NOT_FOUND);
            throw new FinderException(FinderException.ERR_EMPLOYEE_NOT_FOUND);
        }
    }

    public List<Company> getCompaniesLike(String fragmentName) throws FinderException {
        List<Company> companyList = companyDao.retrieveByLetter(fragmentName);
        if(!companyList.isEmpty()) {
            LOGGER.info("Company " + companyList + "found");
            return companyList;
        } else {
            LOGGER.error(FinderException.ERR_COMPANY_NOT_FOUND);
            throw new FinderException(FinderException.ERR_COMPANY_NOT_FOUND);
        }
    }
}
