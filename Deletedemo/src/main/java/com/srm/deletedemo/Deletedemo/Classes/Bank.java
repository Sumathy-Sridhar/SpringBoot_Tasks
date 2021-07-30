package com.srm.deletedemo.Deletedemo.Classes;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;

public class Bank {

    private int accno;
    @NotBlank(message = "Customer Name Required")
    private String name;
    private double balance;

    @Override
    public String toString() {
        return "Bank [accno=" + accno + ", balance=" + balance + ", name=" + name + "]";
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
