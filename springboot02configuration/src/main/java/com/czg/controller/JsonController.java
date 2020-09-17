package com.czg.controller;

import com.czg.config.FoodConfig;
import com.czg.config.VegetablesConfig;
import com.czg.domain.Food;
import com.czg.domain.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

    @Autowired
    private FoodConfig foodConfig;
    @Autowired
    private VegetablesConfig vegetablesConfig;

    @RequestMapping("/food")
    public Food food() {
        Food food = new Food();
        food.setRice(foodConfig.getRice());
        food.setMeat(foodConfig.getMeat());
        food.setSauce(foodConfig.getSauce());
        return food;
    }

    @RequestMapping("/vegetables")
    public Vegetables vegetables() {
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenPepper(vegetablesConfig.getGreenPepper());
        return vegetables;
    }
}
