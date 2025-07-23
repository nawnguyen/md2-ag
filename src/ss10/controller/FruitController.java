package ss10.controller;
import ss10.model.Fruit;
import ss10.service.FruitService;
import java.util.List;


public class FruitController {
    private final FruitService fruitService = new FruitService();


    public List<Fruit> getAllFruit(){
        return fruitService.getAllFruits();
    }

    public void addFruit(Fruit fruit) {
        fruitService.addFruit(fruit);
    }

}
