package com.zosh.controller;


import com.zosh.model.Food;
import com.zosh.model.Restaurant;
import com.zosh.model.User;
import com.zosh.request.CreateFoodRequest;
import com.zosh.service.FoodService;
import com.zosh.service.RestaurantService;
import com.zosh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @Autowired
    private UserService userService;

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/search")
    public ResponseEntity<List<Food>> searchFood(@RequestParam String name,
                                           @RequestHeader("Authorization") String jwt) throws Exception{
        User user=userService.findUserByJwtToken(jwt);
        List<Food> foods=foodService.searchFood(name);
        return  new ResponseEntity<>(foods, HttpStatus.CREATED);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public ResponseEntity<List<Food>> getRestaurantFood(@RequestParam String name,
                                                 @RequestHeader("Authorization") String jwt) throws Exception{
        User user=userService.findUserByJwtToken(jwt);
        List<Food> foods=foodService.searchFood(name);
        return  new ResponseEntity<>(foods, HttpStatus.CREATED);
    }

}
