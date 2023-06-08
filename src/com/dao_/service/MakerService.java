package com.dao_.service;

import com.dao_.dao.MakerDAO;
import com.dao_.domain.Maker;

import java.util.List;

public class MakerService {
    private MakerDAO makerDAO = new MakerDAO();
    public List<Maker> list() {
        return makerDAO.queryMultiply("SELECT * FROM DBHW.Maker", Maker.class);
    }

    public String deleteSingle(String deleteNum) {
        int update = makerDAO.update("DELETE FROM DBHW.Maker WHERE Mno = ?", deleteNum);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

    public String add(String Mno, String Mname, String Mplace, String Mphone, String Memail) {
        String sql = "INSERT INTO DBHW.Maker VALUES ( ?, ?, ?, ?, ?)";
        int update = makerDAO.update(sql, Mno, Mname, Mplace, Mphone, Memail);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

    public String updateMname(String updateId, String updateValue) {
        String sql = "UPDATE DBHW.Maker SET Mname = ? WHERE Mno = ?";
        int update = makerDAO.update(sql, updateValue, updateId);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

    public String updateMplace(String updateId, String updateValue) {
        String sql = "UPDATE DBHW.Maker SET Mname = ? WHERE Mno = ?";
        int update = makerDAO.update(sql, updateValue, updateId);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

    public String updateMphone(String updateId, String updateValue) {
        String sql = "UPDATE DBHW.Maker SET Mphone = ? WHERE Mno = ?";
        int update = makerDAO.update(sql, updateValue, updateId);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }

    public String updateMemail(String updateId, String updateValue) {
        String sql = "UPDATE DBHW.Maker SET Memail = ? WHERE Mno = ?";
        int update = makerDAO.update(sql, updateValue, updateId);
        return update > 0 ? "执行成功" : "该操作对表没有影响";
    }
}
