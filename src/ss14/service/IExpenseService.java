package ss14.service;

import ss14.common.IdNotFoundException;
import ss14.model.Expense;

import java.util.List;

public interface IExpenseService {
    List<Expense> getAll();

    void addExpense(Expense expense);

    void deleteExpense(int id) throws IdNotFoundException;

    void updateExpense(int id, Expense expense);

    Expense findById(int id);

    List<Expense> searchByName(String name);

    List<Expense> sortByNameIncre();

    List<Expense> sortByAmountDecre();
}