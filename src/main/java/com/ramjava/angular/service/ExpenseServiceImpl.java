package com.ramjava.angular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramjava.angular.model.Expense;
import com.ramjava.angular.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepo;
	
	@Override
	public List<Expense> findAll() {
		return expenseRepo.findAll();
	}

}
