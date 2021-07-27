package com.srm.deletedemo.Deletedemo.Controllers;

import java.util.Date;

import com.srm.deletedemo.Deletedemo.Exceptions.BankError;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = { Exception.class })
    public ResponseEntity<BankError> handleBankException(Exception ex, WebRequest req) {

        BankError bobj = new BankError();
        bobj.setId(System.currentTimeMillis() + "");
        bobj.setErrCode("Name is Empty..");
        bobj.setMessage(ex.toString().concat(" , Please Contact Bank Admin for futher queries..."));
        bobj.setCategory("Missing Value Error...");

        System.out.println("Error Occured.. " + ex.toString());
        ex.printStackTrace();

        return new ResponseEntity<BankError>(bobj, HttpStatus.BAD_REQUEST);

    }

}
