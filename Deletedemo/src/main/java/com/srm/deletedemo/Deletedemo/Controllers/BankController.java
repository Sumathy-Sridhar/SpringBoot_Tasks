package com.srm.deletedemo.Deletedemo.Controllers;

import java.util.List;

import javax.validation.Valid;

import com.srm.deletedemo.Deletedemo.Classes.Bank;
import com.srm.deletedemo.Deletedemo.Exceptions.BankError;
import com.srm.deletedemo.Deletedemo.Services.BankManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController extends BaseController {

    @Autowired
    public BankManager service;

    @PostMapping(value = "/bank", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Bank>> addBank(@Valid @RequestBody Bank bk) {
        service.persitBank(bk);
        return new ResponseEntity<List<Bank>>(service.fetchAllBank(), HttpStatus.OK);

    }

    @GetMapping(value = "/bank", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Bank>> getBank() {
        return new ResponseEntity<List<Bank>>(service.fetchAllBank(), HttpStatus.OK);
    }

    @DeleteMapping(value = "/bank/{no}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> deleteCustomer(@PathVariable Integer no) {
        service.deleteBankById(no);
        System.out.println("Account deleted successfully...");
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> errHandle(MethodArgumentNotValidException ex) {
        BankError be = new BankError();
        be.setMessage(ex.getBindingResult().getFieldError().getDefaultMessage());
        be.setCategory("Spring Validation Error");
        ex.printStackTrace();

        return new ResponseEntity<BankError>(be, HttpStatus.BAD_REQUEST);

    }

}
