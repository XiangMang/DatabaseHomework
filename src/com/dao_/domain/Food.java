package com.dao_.domain;

import com.dao_.dao.BasicDAO;

public class Food {
    private String Fno;
    private String Fname;
    private String Fclass;
    private String Fplace;
    private String Fid;

    public Food() {
    }

    public Food(String fno, String fname, String fclass, String fplace, String fid) {
        Fno = fno;
        Fname = fname;
        Fclass = fclass;
        Fplace = fplace;
        Fid = fid;
    }

    public String getFno() {
        return Fno;
    }

    public void setFno(String fno) {
        Fno = fno;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getFclass() {
        return Fclass;
    }

    public void setFclass(String fclass) {
        Fclass = fclass;
    }

    public String getFplace() {
        return Fplace;
    }

    public void setFplace(String fplace) {
        Fplace = fplace;
    }

    public String getFid() {
        return Fid;
    }

    public void setFid(String fid) {
        Fid = fid;
    }

    @Override
    public String toString() {
        return "{" +
                "Fno='" + Fno + '\'' +
                ", Fname='" + Fname + '\'' +
                ", Fclass='" + Fclass + '\'' +
                ", Fplace='" + Fplace + '\'' +
                ", Fid='" + Fid + '\'' +
                '}';
    }
}
