package com.dao_.service;

import com.dao_.dao.WarehouseDAO;
import com.dao_.domain.Warehouse;
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
}
