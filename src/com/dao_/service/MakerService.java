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
}
