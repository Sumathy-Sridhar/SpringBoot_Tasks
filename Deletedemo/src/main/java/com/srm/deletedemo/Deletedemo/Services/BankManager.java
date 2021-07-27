package com.srm.deletedemo.Deletedemo.Services;

import java.util.List;

import com.srm.deletedemo.Deletedemo.Classes.Bank;

public interface BankManager {

    public void persitBank(Bank bk);

    public List<Bank> fetchAllBank();

    public Bank deleteBankById(int no);

}
