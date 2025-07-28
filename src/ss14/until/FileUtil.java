package ss14.until;

import ss14.model.Expense;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILE_PATH = "src/ss14/data/data.csv";

    public static List<Expense> read() {
        List<Expense> list = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) return list;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                int id = Integer.parseInt(arr[0]);
                String name = arr[1];
                String date = arr[2];
                double amount = Double.parseDouble(arr[3]);
                String note = arr[4];
                list.add(new Expense(id, name, date, amount, note));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void write(List<Expense> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Expense e : list) {
                bw.write(e.getId() + "," + e.getName() + "," + e.getDate() + "," + e.getAmount() + "," + e.getNote());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
