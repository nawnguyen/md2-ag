package ss9.controller;
import ss9.model.Fruit;
import ss9.service.FruitService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class FruitController {
    private FruitService fruitService = new FruitService();
    Scanner scanner = new Scanner(System.in);

    public void showAllFruits() {
        List<Fruit> allFruits = fruitService.getAllFruits();
        if (allFruits.isEmpty()) {
            System.out.println("Danh sách trống !");
        } else {
            for (Fruit fruit : allFruits) {
                System.out.println(fruit);
            }
        }
    }

    public void addFruit(String nameFruit, String typeFruit, String originFruit, int price) {
        LocalDate manufacturingDate = LocalDate.now();
        LocalDate expiryDate = manufacturingDate.plusDays(10);
        fruitService.addFruit(nameFruit, typeFruit, manufacturingDate, expiryDate, originFruit, price);
    }

}
