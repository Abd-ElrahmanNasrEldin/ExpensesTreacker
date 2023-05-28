package com.abdelrahman.nasr.eldin.expensestreacker.service;

import com.abdelrahman.nasr.eldin.expensestreacker.model.Expense;
import com.abdelrahman.nasr.eldin.expensestreacker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesServiceImp implements ExpenseService {
    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }

    @Override
    public Expense findByExpenseId(Long expenseId) {
        return findByExpenseId(expenseId);
    }
}
