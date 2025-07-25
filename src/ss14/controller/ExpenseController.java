package ss14.controller;

import ss14.common.IdNotFoundException;
import ss14.model.Expense;
import ss14.service.ExpenseService;
import ss14.service.IExpenseService;

import java.util.List;

public class ExpenseController {
    private IExpenseService service = new ExpenseService();

    public List<Expense> getAll() {
        return service.getAll();
    }

    public void addExpense(Expense expense) {
        service.addExpense(expense);
    }

    public void deleteExpense(int id) throws IdNotFoundException {
        service.deleteExpense(id);
    }

    public void updateExpense(int id, Expense expense) {
        service.updateExpense(id, expense);
    }

    public Expense findById(int id) {
        return service.findById(id);
    }

    public List<Expense> searchByName(String name) {
        return service.searchByName(name);
    }

    public List<Expense> sortByNameIncre() {
        return service.sortByNameIncre();
    }

    public List<Expense> sortByAmountDecre() {
        return service.sortByAmountDecre();
    }
}
