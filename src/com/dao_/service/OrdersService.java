package com.dao_.service;

import com.dao_.dao.OrdersDAO;
import com.dao_.domain.Orders;

import java.util.List;

public class OrdersService {
    private OrdersDAO ordersDAO = new OrdersDAO();
    public List<Orders> list() {
        return ordersDAO.queryMultiply("SELECT * FROM DBHW.Orders", Orders.class);
    }

    public String deleteSingle(String deleteNum) {
        int update = ordersDAO.update("DELETE FROM DBHW.Orders WHERE Ono = ?", deleteNum);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }
}
