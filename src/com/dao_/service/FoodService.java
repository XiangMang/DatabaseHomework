package com.dao_.service;

import com.dao_.dao.FoodDAO;
import com.dao_.domain.Food;

import java.util.List;

public class FoodService {
    private FoodDAO foodDAO = new FoodDAO();
    public List<Food> list() {
        return foodDAO.queryMultiply("SELECT * FROM DBHW.Food", Food.class);
    }

    public String deleteSingle(String deleteNum) {
        int update = foodDAO.update("DELETE FROM DBHW.Food WHERE Bno = ?", deleteNum);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

    public String add(String Fno, String Fname, String Fclass, String Wno, String Eno) {
        Object fno = Fno;
        Object fname = Fname;
        Object fcalss = Fclass;
        Object wno = Wno;
        Object eno = Eno;
        int update = foodDAO.update("INSERT INTO Food VALUES ( ?, ?, ?, ?, ?)", 1, fno, 2, fname, 3, fcalss, 4, wno, 5, eno);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }
}
