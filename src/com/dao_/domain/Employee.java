package com.dao_.domain;

import javax.print.DocFlavor;
import java.nio.file.Paths;

public class Employee {
    private String Eno;
    private String Ename;
    private String Esex;
    private Integer Eage;
    private String Eid;

    public Employee() {
    }

    public Employee(String eno, String ename, String esex, Integer eage, String eid) {
        Eno = eno;
        Ename = ename;
        Esex = esex;
        Eage = eage;
        Eid = eid;
    }

    public String getEno() {
        return Eno;
    }

    public void setEno(String eno) {
        Eno = eno;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getEsex() {
        return Esex;
    }

    public void setEsex(String esex) {
        Esex = esex;
    }

    public Integer getEage() {
        return Eage;
    }

    public void setEage(Integer eage) {
        Eage = eage;
    }

    public String getEid() {
        return Eid;
    }

    public void setEid(String eid) {
        Eid = eid;
    }

    @Override
    public String toString() {
        return "{" +
                "Eno='" + Eno + '\'' +
                ", Ename='" + Ename + '\'' +
                ", Esex='" + Esex + '\'' +
                ", Eage=" + Eage +
                ", Eid='" + Eid + '\'' +
                '}';
    }
}
