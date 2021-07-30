package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Controller;

import java.util.List;
import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.CardManagement;
import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Services.CardManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class CardController extends BaseController {

    @Autowired
    private CardManager cardService;

    @GetMapping(value = "/cardlist", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CardManagement> getAllCards() {
        return cardService.getAllCards();
    }

    @PostMapping(value = "/addcard", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addCards(@RequestBody CardManagement cardRecord) {
        cardService.addCards(cardRecord);
        System.out.println(cardRecord.toString());

    }

}
