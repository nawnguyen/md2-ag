package ss14.repository;

import ss14.model.Expense;
import ss14.until.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class ExpenseRepository {
    private static List<Expense> expenses = FileUtil.read();

    static {
        if (expenses.isEmpty()) {
            expenses.add(new Expense(1, "Ăn sáng", "2025-07-01", 30000, "Phở tái nạm"));
            expenses.add(new Expense(2, "Cafe", "2025-07-02", 20000, "Cafe đen"));
            expenses.add(new Expense(3, "Xăng xe", "2025-07-03", 50000, "Đổ đầy bình"));
            expenses.add(new Expense(4, "Mua sách", "2025-07-04", 100000, "Bài giảng cuối cùng"));
            expenses.add(new Expense(5, "Ăn trưa", "2025-07-05", 40000, "Cơm gà"));
            FileUtil.write(expenses);
        }
    }

    public List<Expense> getAll() {
        return new ArrayList<>(expenses);
    }

    public void add(Expense expense) {
        expenses.add(expense);
        FileUtil.write(expenses);
    }

    public void delete(int id) {
        expenses.removeIf(e -> e.getId() == id);
        FileUtil.write(expenses);
    }

    public void update(int id, Expense newExpense) {
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i).getId() == id) {
                expenses.set(i, newExpense);
                FileUtil.write(expenses);
                return;
            }
        }
    }

    public Expense findById(int id) {
        for (Expense e : expenses) {
            if (e.getId() == id) {
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