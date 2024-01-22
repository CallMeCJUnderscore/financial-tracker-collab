package com.pluralsight.controllers;

import com.pluralsight.data.ITransactionDAO;
import com.pluralsight.data.mysql.MySQLTranscationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
@CrossOrigin
@RequestMapping("transactions")
public class TransactionController {

    private ITransactionDAO transactionDAO;

    @Autowired
    public TransactionController(ITransactionDAO transactionDAO){this.transactionDAO = transactionDAO;}
}
