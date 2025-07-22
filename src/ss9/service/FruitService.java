package ss9.service;

import ss9.model.Fruit;
import ss9.repository.FruitRepository;

import java.time.LocalDate;
import java.util.List;

public class FruitService {
    private FruitRepository fruitRepository = new FruitRepository();

    public List<Fruit> getAllFruits() {
        return fruitRepository.getFruits();
    }


    public void addFruit(Fruit fruit) {
        fruitRepository.addFruit(fruit);
    }
}
