package com.abdelrahman.nasr.eldin.expensestreacker.controller;

import com.abdelrahman.nasr.eldin.expensestreacker.model.Expense;
import com.abdelrahman.nasr.eldin.expensestreacker.service.ExpenseService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
@NoArgsConstructor
public class ExpenseController {
    @Autowired
    ExpenseService expenseService;

    @GetMapping("/expenses")
    public ResponseEntity<List<Expense>> getAllExpenses() {
        return new ResponseEntity<>(expenseService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/expenses/{id}")
    public ResponseEntity<Expense> getExpenseById(@PathVariable(name = "id") long expenseId) {
        return new ResponseEntity<>(expenseService.findByExpenseId(expenseId), HttpStatus.OK);
    }


}
