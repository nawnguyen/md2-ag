package ss14.service;

import ss14.model.Expense;
import ss14.repository.ExpenseRepository;

import java.util.ArrayList;
import java.util.Comparator;
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

    public List<Expense> sortByNameIncre() {
        List<Expense> list = new ArrayList<>(repo.getAll());
        list.sort(Comparator.comparing(Expense::getName));
        return list;
    }

    public List<Expense> sortByAmountDecre() {
        List<Expense> list = new ArrayList<>(repo.getAll());
        list.sort((e1, e2) -> {
            if (e1.getAmount() == e2.getAmount()) {
                return e1.getName().compareTo(e2.getName());
            }
            return Double.compare(e2.getAmount(), e1.getAmount());
        });

        return list;
    }
}
