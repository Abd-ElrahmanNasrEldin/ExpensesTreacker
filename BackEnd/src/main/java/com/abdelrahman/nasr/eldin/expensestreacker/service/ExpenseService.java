package com.abdelrahman.nasr.eldin.expensestreacker.service;

import com.abdelrahman.nasr.eldin.expensestreacker.model.Expense;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpenseService {
    List<Expense> findAll();

    Expense findByExpenseId(Long expenseId);
}
