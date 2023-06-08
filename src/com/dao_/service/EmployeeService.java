package com.dao_.service;

import com.dao_.dao.EmployeeDAO;
import com.dao_.domain.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeDAO employeeDAO = new EmployeeDAO();
    public List<Employee> list() {
        return employeeDAO.queryMultiply("SELECT * FROM DBHW.Employee", Employee.class);
    }

    public String deleteSingle(String deleteNum) {
        int update = employeeDAO.update("DELETE FROM DBHW.Employee WHERE Eno = ?", deleteNum);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }
}
