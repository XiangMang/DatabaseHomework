package com.dao_.domain;

import java.nio.file.Paths;

public class Maker {
    private String Mno;
    private String Mname;
    private String Mplace;
    private String Mphone;
    private String Memail;

    public Maker() {
    }

    public Maker(String mno, String mname, String mplace, String mphone, String memail) {
        Mno = mno;
        Mname = mname;
        Mplace = mplace;
        Mphone = mphone;
        Memail = memail;
    }

    public String getMno() {
        return Mno;
    }

    public void setMno(String mno) {
        Mno = mno;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String mname) {
        Mname = mname;
    }

    public String getMplace() {
        return Mplace;
    }

    public void setMplace(String mplace) {
        Mplace = mplace;
    }

    public String getMphone() {
        return Mphone;
    }

    public void setMphone(String mphone) {
        Mphone = mphone;
    }

    public String getMemail() {
        return Memail;
    }

    public void setMemail(String memail) {
        Memail = memail;
    }

    @Override
    public String toString() {
        return "{" +
                "Mno='" + Mno + '\'' +
                ", Mname='" + Mname + '\'' +
                ", Mplace='" + Mplace + '\'' +
                ", Mphone='" + Mphone + '\'' +
                ", Memail='" + Memail + '\'' +
                '}';
    }
}
