package com.dao_.dao;

import com.dao_.domain.Orders;

import java.sql.Timestamp;

public class OrdersDAO extends BasicDAO<Orders> {
    private String Ono;
    private Integer Ospend;
    private Timestamp Otime;
    private String Oclass;
    private String Oid;
    private String Ospace;

    public OrdersDAO() {
    }

    public OrdersDAO(String ono, Integer ospend, Timestamp otime, String oclass, String oid, String ospace) {
        Ono = ono;
        Ospend = ospend;
        Otime = otime;
        Oclass = oclass;
        Oid = oid;
        Ospace = ospace;
    }

    public String getOno() {
        return Ono;
    }

    public void setOno(String ono) {
        Ono = ono;
    }

    public Integer getOspend() {
        return Ospend;
    }

    public void setOspend(Integer ospend) {
        Ospend = ospend;
    }

    public Timestamp getOtime() {
        return Otime;
    }

    public void setOtime(Timestamp otime) {
        Otime = otime;
    }

    public String getOclass() {
        return Oclass;
    }

    public void setOclass(String oclass) {
        Oclass = oclass;
    }

    public String getOid() {
        return Oid;
    }

    public void setOid(String oid) {
        Oid = oid;
    }

    public String getOspace() {
        return Ospace;
    }

    public void setOspace(String ospace) {
        Ospace = ospace;
    }

    @Override
    public String toString() {
        return "OrdersDAO{" +
                "Ono='" + Ono + '\'' +
                ", Ospend=" + Ospend +
                ", Otime=" + Otime +
                ", Oclass='" + Oclass + '\'' +
                ", Oid='" + Oid + '\'' +
                ", Ospace='" + Ospace + '\'' +
                '}';
    }
}
