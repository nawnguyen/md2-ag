package ss14.model;

public class Expense {
    private String id;
    private String name;
    private String date;
    private double amount;
    private String note;

    public Expense(String id, String name, String date, double amount, String note) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.amount = amount;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Tên: " + name +
                " | Ngày: " + date +
                " | Số tiền: " + amount +
                " | Ghi chú: " + note;
    }
}
