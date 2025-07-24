package ss14.service;

import ss14.model.Expense;

import java.util.List;

public interface IExpenseService {
    List<Expense> getAll();

    void addExpense(Expense expense);

    void deleteExpense(String id);

    void updateExpense(String id, Expense expense);

    Expense findById(String id);

    List<Expense> searchByName(String name);

    List<Expense> sortByNameIncre();

    List<Expense> sortByAmountDecre();
}