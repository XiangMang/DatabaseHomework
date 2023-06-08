package com.dao_.domain;


import java.sql.Timestamp;

public class Orders {
    private String Ono;
    private Integer Ospend;
    private Timestamp Otime;

    public Orders() {
    }

    public Orders(String ono, Integer ospend, Timestamp otime) {
        Ono = ono;
        Ospend = ospend;
        Otime = otime;
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

    @Override
    public String toString() {
        return "{" +
                "Ono='" + Ono + '\'' +
                ", Ospend=" + Ospend +
                ", Otime=" + Otime +
                '}';
    }
}
