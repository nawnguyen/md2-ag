package ss12.repository;

import ss12.model.Fruit;

import java.util.HashMap;
import java.util.Map;

public class FruitRepository {
    private Map<String, Fruit> fruitMap = new HashMap<>();

    public void save(Fruit fruit) {
        fruitMap.put(fruit.getId(), fruit);
    }

    public void delete(String id) {
        fruitMap.remove(id);
    }

    public Map<String, Fruit> findAll() {
        return fruitMap;
    }
}
