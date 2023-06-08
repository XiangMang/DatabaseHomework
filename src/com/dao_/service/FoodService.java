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
        int update = foodDAO.update("DELETE FROM DBHW.Food WHERE Fno = ?", deleteNum);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

    public String add(String Fno, String Fname, String Fclass, String Wno, String Eno) {
        String sql = "INSERT INTO DBHW.Food VALUES ( ?, ?, ?, ?, ?)";
        int update = foodDAO.update(sql, Fno, Fname, Fclass, Wno, Eno);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }
}
