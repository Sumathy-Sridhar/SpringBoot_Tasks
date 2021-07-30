package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Services;

import java.util.ArrayList;
import java.util.List;

import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.CardManagement;
import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.UserManagement;
import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Repo.CardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardManagerImpl implements CardManager {

    @Autowired
    private CardRepository cardRepo;

    @Override
    public List<CardManagement> getAllCards() {

        List<CardManagement> cardRecords = new ArrayList<>();
        cardRepo.findAll().forEach(cardRecords::add);
        return cardRecords;

    }

    @Override
    public void addCards(CardManagement cardRecord) {
        UserManagement uobj = new UserManagement();
        uobj.setUsername("Sumathy");
        uobj.setPassword("sumi@22");
        cardRecord.setUm(uobj);
        cardRepo.save(cardRecord);
    }

}
