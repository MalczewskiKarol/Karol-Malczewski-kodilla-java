package com.kodilla.hibernate.manytomany.facade;

public class FinderException extends Exception {
    public static String ERR_COMPANY_NOT_FOUND = "Company not found.";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee not found";
    public static String ERR_LIST_IS_EMPTY = "There is no companies/employees in our database";

    public FinderException(String message) {
        super(message);
    }
}
