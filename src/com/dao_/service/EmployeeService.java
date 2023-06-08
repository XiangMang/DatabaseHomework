package com.dao_.service;

import com.dao_.dao.EmployeeDAO;
import com.dao_.domain.Employee;

import java.util.List;
import java.util.Vector;

public class EmployeeService {
    private EmployeeDAO employeeDAO = new EmployeeDAO();
    public List<Employee> list() {
        return employeeDAO.queryMultiply("SELECT * FROM DBHW.Employee", Employee.class);
    }

    public String deleteSingle(String deleteNum) {
        int update = employeeDAO.update("DELETE FROM DBHW.Employee WHERE Eno = ?", deleteNum);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

    public String add(String Eno, String Ename, String Esex, Integer Eage, String Eid) {
        String sql = "INSERT INTO DBHW.Employee VALUES ( ?, ?, ?, ?, ?)";
        int update = employeeDAO.update(sql, Eno, Ename, Esex, Eage, Eid);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

    public String updateEname(String updateId, String updateValue) {
        String sql = "UPDATE DBHW.Employee SET Ename = ? WHERE Eno = ?";
        int update = employeeDAO.update(sql, updateValue, updateId);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

    public String updateEsex(String updateId, String updateValue) {
        String sql = "UPDATE DBHW.Employee SET Esex = ? WHERE Eno = ?";
        int update = employeeDAO.update(sql, updateValue, updateId);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

    public String updateEage(String updateId, Integer updateValue) {
        String sql = "UPDATE DBHW.Employee SET Eage = ? WHERE Eno = ?";
        int update = employeeDAO.update(sql, updateValue, updateId);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

    public String updateEid(String updateId, Integer updateValue) {
        String sql = "UPDATE DBHW.Employee SET Eid = ? WHERE Eno = ?";
        int update = employeeDAO.update(sql, updateValue, updateId);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

}
