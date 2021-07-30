package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity;

import java.io.Serializable;

public class StudentPk implements Serializable {

    private int sid;
    private int deptid;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }
}
