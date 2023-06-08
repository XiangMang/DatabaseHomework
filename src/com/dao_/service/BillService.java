package com.dao_.service;

import com.dao_.dao.BillDAO;
import com.dao_.domain.Bill;

import java.util.List;

public class BillService {
    // 定义一个 BillService 对象
    private BillDAO billDAO = new BillDAO();

    // 返回所有Bill的信息
    public List<Bill> list() {
        return billDAO.queryMultiply("SELECT * FROM DBHW.Bill", Bill.class);
    }

    public Bill querySingle(String id) {
        return billDAO.querySingle("SELECT * FROM DBHW.Bill WHERE Bno = ?", Bill.class, id);
    }

    public String deleteSingle(String deleteNum) {
        int update = billDAO.update("DELETE FROM DBHW.Bill WHERE Bno = ?", deleteNum);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

}
