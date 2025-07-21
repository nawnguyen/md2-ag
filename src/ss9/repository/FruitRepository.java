package ss9.repository;
import ss9.model.Fruit;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class FruitRepository {
    private static List<Fruit> fruits = new ArrayList<>();

    static {
        fruits.add(new Fruit("Táo", "Nhiệt đới", LocalDate.now(), LocalDate.now().plusDays(10), "Made in China", 10000));
        fruits.add(new Fruit("Mận", "Nhiệt đới", LocalDate.now(), LocalDate.now().plusDays(11), "Made in Viet Nam", 5000));
        fruits.add(new Fruit("Mango", "Nhiệt đới", LocalDate.now(), LocalDate.now().plusDays(5), "Made in Viet Nam", 5000));
        fruits.add(new Fruit("BlackBerry", "Nhiệt đới", LocalDate.now(), LocalDate.now().plusDays(7), "Made in Viet Nam", 20000));
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }
}
