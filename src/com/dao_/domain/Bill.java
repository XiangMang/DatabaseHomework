package com.dao_.domain;

import javafx.util.converter.TimeStringConverter;
import org.hamcrest.BaseMatcher;

import java.sql.Time;
import java.sql.Timestamp;

public class Bill {
    private String Bno;
    private Integer Bspend;
    private Timestamp Btime;
    private String Bclass;
    private String Bemployee;
    private String Bmaker;

    public Bill() {
    }

    public Bill(String bno, Integer bspend, Timestamp btime, String bclass, String bemployee, String bmaker) {
        Bno = bno;
        Bspend = bspend;
        Btime = btime;
        Bclass = bclass;
        Bemployee = bemployee;
        Bmaker = bmaker;
    }

    public String getBno() {
        return Bno;
    }

    public void setBno(String bno) {
        Bno = bno;
    }

    public Integer getBspend() {
        return Bspend;
    }

    public void setBspend(Integer bspend) {
        Bspend = bspend;
    }

    public Timestamp getBtime() {
        return Btime;
    }

    public void setBtime(Timestamp btime) {
        Btime = btime;
    }

    public String getBclass() {
        return Bclass;
    }

    public void setBclass(String bclass) {
        Bclass = bclass;
    }

    public String getBemployee() {
        return Bemployee;
    }

    public void setBemployee(String bemployee) {
        Bemployee = bemployee;
    }

    public String getBmaker() {
        return Bmaker;
    }

    public void setBmaker(String bmaker) {
        Bmaker = bmaker;
    }

    @Override
    public String toString() {
        return "{" +
                "Bno='" + Bno + '\'' +
                ", Bspend=" + Bspend +
                ", Btime=" + Btime +
                ", Bclass='" + Bclass + '\'' +
                ", Bemployee='" + Bemployee + '\'' +
                ", Bmaker='" + Bmaker + '\'' +
                '}';
    }
}