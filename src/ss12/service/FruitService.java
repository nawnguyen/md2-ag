package ss12.service;

import ss12.model.Fruit;
import ss12.repository.FruitRepository;

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

