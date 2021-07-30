package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Services;

import java.util.List;

import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.CardManagement;

public interface CardManager {

    public List<CardManagement> getAllCards();

    public void addCards(CardManagement cardRecord);
}
