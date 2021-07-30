package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.type.TrueFalseType;

@Entity
@Table(name = "userdetails")
public class UserManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Transient
    @Column(name = "Age")
    private int age;

    @Temporal(value = TemporalType.DATE)
    @Column(name = "CREATED_TIME")
    private Date dt = new Date(System.currentTimeMillis());

    @Override
    public String toString() {
        return "UserManagement [age=" + age + ", dt=" + dt + ", id=" + id + ", password=" + password + ", username="
                + username + "]";
    }

    public int getAge() {
        return age;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "uname", length = 100)
    private String username;

    @Column(name = "pswd", length = 100)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
