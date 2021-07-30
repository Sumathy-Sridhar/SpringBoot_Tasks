package com.srm.deletedemo.Deletedemo.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import com.srm.deletedemo.Deletedemo.Classes.Bank;

import org.springframework.stereotype.Service;

@Service
public class BankManagerImpl implements BankManager {

    List<Bank> banklist = new ArrayList<>();

    @Override
    public void persitBank(Bank bk) {
        banklist.add(bk);

    }

    @Override
    public List<Bank> fetchAllBank() {
        return banklist;
    }

    @Override
    public Bank deleteBankById(int no) {
        Iterator<Bank> iterator = banklist.iterator();
        while (iterator.hasNext()) {
            Bank b = iterator.next();
            if (b.getAccno() == no) {
                iterator.remove();
                return b;
            }
        }
        return null;
    }
}
