package ss13.service;

import ss13.model.Expense;
import ss13.repository.ExpenseRepository;

import java.util.List;

public class ExpenseService implements IExpenseService {
    private ExpenseRepository repo = new ExpenseRepository();

    public List<Expense> getAll() {
        return repo.getAll();
    }

    public void addExpense(Expense expense) {
        repo.add(expense);
    }

    public void deleteExpense(String id) {
        repo.delete(id);
    }

    public void updateExpense(String id, Expense expense) {
        repo.update(id, expense);
    }

    public Expense findById(String id) {
        return repo.findById(id);
    }

    public List<Expense> searchByName(String name) {
        return repo.searchByName(name);
    }
}
