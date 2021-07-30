package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.data.jpa.repository.Temporal;

@Entity
@Table(name = "cardtable")
public class CardManagement {

    @Id
    @Column(name = "cardid")
    private int cardid;

    private String cardholdername;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date expirydate;

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private UserManagement um;

    public UserManagement getUm() {
        return um;
    }

    public void setUm(UserManagement um) {
        this.um = um;
    }

    public int getCardid() {
        return cardid;
    }

    public void setCardid(int cardid) {
        this.cardid = cardid;
    }

    public String getCardholdername() {
        return cardholdername;
    }

    public void setCardholdername(String cardholdername) {
        this.cardholdername = cardholdername;
    }

    @Override
    public String toString() {
        return "CardManagement [cardholdername=" + cardholdername + ", cardid=" + cardid + ", expirydate=" + expirydate
                + ", um=" + um + "]";
    }

}
