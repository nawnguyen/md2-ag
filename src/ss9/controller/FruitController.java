package ss9.controller;
import ss9.model.Fruit;
import ss9.service.FruitService;
import java.util.List;


public class FruitController {
    private FruitService fruitService = new FruitService();


    public List<Fruit> getAllFruit(){
        return fruitService.getAllFruits();
    }

    public void addFruit(Fruit fruit) {
        fruitService.addFruit(fruit);
    }

}
