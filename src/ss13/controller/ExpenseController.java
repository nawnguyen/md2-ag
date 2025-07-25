package ss13.controller;

import ss13.model.Expense;
import ss13.service.ExpenseService;
import ss13.service.IExpenseService;

import java.util.List;

public class ExpenseController {
    private IExpenseService service = new ExpenseService();

    public List<Expense> getAll() {
        return service.getAll();
    }

    public void addExpense(Expense expense) {
        service.addExpense(expense);
    }

    public void deleteExpense(String id) {
        service.deleteExpense(id);
    }

    public void updateExpense(String id, Expense expense) {
        service.updateExpense(id, expense);
    }

    public Expense findById(String id) {
        return service.findById(id);
    }

    public List<Expense> searchByName(String name) {
        return service.searchByName(name);
    }
}
