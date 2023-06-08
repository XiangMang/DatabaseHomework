package com.dao_.service;

import com.dao_.dao.WarehouseDAO;
import com.dao_.domain.Warehouse;
import com.mysql.cj.util.DnsSrv;
import org.w3c.dom.ls.LSException;

import java.util.List;

public class WarehouseService {
    private WarehouseDAO warehouseDAO = new WarehouseDAO();
    public List<Warehouse> list() {
        return warehouseDAO.queryMultiply("SELECT * FROM DBHW.Warehouse", Warehouse.class);
    }

    public String deleteSingle(String deleteNum) {
        int update = warehouseDAO.update("DELETE FROM DBHW.Warehouse WHERE Wno = ?", deleteNum);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

    public String add(String Wno, String Wclass, Integer Wnum) {
        String sql = "INSERT INTO DBHW.Warehouse VALUES ( ?, ?, ?)";
        int update = warehouseDAO.update(sql, Wno, Wclass, Wnum);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }
}
