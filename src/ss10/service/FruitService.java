package ss10.service;

import ss10.model.Fruit;
import ss10.repository.FruitRepository;

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
