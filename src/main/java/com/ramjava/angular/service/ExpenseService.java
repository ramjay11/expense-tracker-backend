package com.ramjava.angular.service;

import java.util.List;

import com.ramjava.angular.model.Expense;

public interface ExpenseService {

	// Will return list of expenses
	List<Expense> findAll();
}
