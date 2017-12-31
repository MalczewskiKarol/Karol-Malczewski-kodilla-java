package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Service
public final class Facade {
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);
    private EntityManager entityManager;

    @Autowired
    private Employee employee;
    @Autowired
    private Company company;

    public void companyFinder() throws FinderException {
        boolean wasError = false;
        LOGGER.info("Finding employee name...");
        if(company.getEmployees().size() == 0) {
            LOGGER.error(FinderException.ERR_LIST_IS_EMPTY);
            wasError = true;
        } try {
            Query q1 = entityManager.createQuery("SELECT * FROM EMPLOYEES" + " WHERE LASTNAME LIKE '%Gre%'");
            if(company.getName() == null) {
                LOGGER.error(FinderException.ERR_EMPLOYEE_NOT_FOUND);
                wasError = true;
                throw new FinderException(FinderException.ERR_EMPLOYEE_NOT_FOUND);
            }
        } finally {
            if(wasError) {
                LOGGER.info("There were an error. Search failed.");
            }
        }
    }

    public void employeeFinder(final Employee employee, final String lastName) throws FinderException {
        boolean wasError = false;
        LOGGER.info("Finding company name...");
        if(employee.getCompanies().size() == 0) {
            LOGGER.error(FinderException.ERR_LIST_IS_EMPTY);
            wasError = true;
        } try {
            Query q2 = entityManager.createQuery("SELECT * FROM COMPANIES" + "WHERE NAME LIKE '%rey%'");
            if(employee.getCompanies() == null) {
                LOGGER.error(FinderException.ERR_COMPANY_NOT_FOUND);
                wasError = true;
                throw new FinderException(FinderException.ERR_COMPANY_NOT_FOUND);
            }
        } finally {
            if(wasError) {
                LOGGER.info("There were an error. Search failed.");
            }
        }
    }
}
