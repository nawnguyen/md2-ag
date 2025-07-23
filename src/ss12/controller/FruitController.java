package ss12.controller;

import ss12.model.Fruit;
import ss12.service.FruitService;

import java.util.Map;

public class FruitController {
    private final FruitService service = new FruitService();

    public Map<String, Fruit> findAll() {
        return service.findAll();
    }
    public void save(Fruit fruit) {
        service.save(fruit);
    }
    public void delete(String id) {
        service.delete(id);
    }
}
