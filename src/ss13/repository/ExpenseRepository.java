package ss13.repository;

import ss13.model.Expense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseRepository {
    private static List<Expense> expenses = new ArrayList<>();

    static {
        expenses.add(new Expense("VT01", "Ăn sáng", "2025-07-01", 30000, "Phở tái nạm"));
        expenses.add(new Expense("VT02", "Xăng xe", "2025-07-02", 50000, "Đổ xăng xe máy"));
        expenses.add(new Expense("VT03", "Cafe", "2025-07-03", 25000, "Cafe với bạn"));
    }

    public List<Expense> getAll() {
        return expenses;
    }

    public void add(Expense expense) {
        expenses.add(expense);
    }

    public void delete(String id) {
        expenses.removeIf(e -> e.getId().equalsIgnoreCase(id));
    }

    public void update(String id, Expense newExpense) {
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i).getId().equalsIgnoreCase(id)) {
                expenses.set(i, newExpense);
                break;
            }
        }
    }

    public Expense findById(String id) {
        return expenses.stream()
                .filter(e -> e.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
    }

    public List<Expense> searchByName(String name) {
        List<Expense> result = new ArrayList<>();
        for (Expense e : expenses) {
            if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(e);
            }
        }
        return result;
    }
}