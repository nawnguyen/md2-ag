package ss14.repository;

import ss14.model.Expense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseRepository {
    private static List<Expense> expenses = new ArrayList<>();

    static {
        expenses.add(new Expense("1", "Ăn sáng", "2025-07-01", 30000, "Phở tái nạm"));
        expenses.add(new Expense("2", "Cafe", "2025-07-02", 20000, "Cafe đen"));
        expenses.add(new Expense("3", "Xăng xe", "2025-07-03", 50000, "Đổ đầy bình"));
        expenses.add(new Expense("4", "Mua sách", "2025-07-04", 100000, "Bài giảng cuối cùng"));
        expenses.add(new Expense("5", "Ăn trưa", "2025-07-05", 40000, "Cơm gà"));
    }

    public List<Expense> getAll() {
        return expenses;
    }

    public void add(Expense expense) {
        expenses.add(expense);
    }

    public void delete(String id) {
        expenses.removeIf(e -> e.getId().equals(id));
    }

    public void update(String id, Expense newExpense) {
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i).getId().equals(id)) {
                expenses.set(i, newExpense);
                return;
            }
        }
    }

    public Expense findById(String id) {
        for (Expense e : expenses) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
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

