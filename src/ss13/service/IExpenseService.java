package ss13.service;

import ss13.model.Expense;

import java.util.List;

public interface IExpenseService {
    List<Expense> getAll();

    void addExpense(Expense expense);

    void deleteExpense(String id);

    void updateExpense(String id, Expense expense);

    Expense findById(String id);

    List<Expense> searchByName(String name);
}

