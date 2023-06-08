package com.dao_.domain;

import java.nio.file.Paths;

public class Warehouse {
    private String Wno;
    private String Wclass;
    private Integer Wnum;

    public Warehouse() {
    }

    public Warehouse(String wno, String wclass, Integer wnum) {
        Wno = wno;
        Wclass = wclass;
        Wnum = wnum;
    }

    public String getWno() {
        return Wno;
    }

    public void setWno(String wno) {
        Wno = wno;
    }

    public String getWclass() {
        return Wclass;
    }

    public void setWclass(String wclass) {
        Wclass = wclass;
    }

    public Integer getWnum() {
        return Wnum;
    }

    public void setWnum(Integer wnum) {
        Wnum = wnum;
    }

    @Override
    public String toString() {
        return "{" +
                "Wno='" + Wno + '\'' +
                ", Wclass='" + Wclass + '\'' +
                ", Wnum=" + Wnum +
                '}';
    }
}
