package com.dao_.test;

import com.dao_.dao.EmployeeDAO;
import com.dao_.domain.Employee;
import org.junit.Test;

import java.util.List;

public class TestDAO {

    // 测试 EmployeeDAO对Employee表的crud操作
    @Test
    public void testEmployeeDAO() {
        // 1. 查询多行结果
        EmployeeDAO employeeDAO = new EmployeeDAO();
        List<Employee> employees = employeeDAO.queryMultiply("SELECT * FROM DBHW.Employee", Employee.class);
        System.out.println("===多行查询结果===");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // 2. 查询单行结果
        Employee employee1 = employeeDAO.querySingle("SELECT * FROM DBHW.Employee WHERE Eno = ?", Employee.class, "E0001");
        System.out.println("===单行查询结果===");
        System.out.println(employee1);

        // 3. 查询单行单列
        Object object = employeeDAO.queryScalar("SELECT Ename FROM DBHW.Employee WHERE Eno = ?", "E0002");
        System.out.println("===单行单列查询结果");
        System.out.println(object);

        // 4. dml操作
//        employeeDAO.update(sql, .......);
//        System.out.println(update > 0 ? "执行成功" : "执行没有影响表");
    }
}
