package ss11.service;

import ss11.model.Fruit;
import ss11.repository.FruitRepository;

import java.util.Map;

public class FruitService {
    private FruitRepository fruitRepository = new FruitRepository();

    public void save(Fruit fruit) {
        fruitRepository.save(fruit);
    }

    public void delete(String id) {
        fruitRepository.delete(id);
    }

    public Map<String, Fruit> findAll() {
        return fruitRepository.findAll();
    }
}

