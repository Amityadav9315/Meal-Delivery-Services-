package com.zosh.service;

import com.zosh.model.Category;
import com.zosh.model.Food;
import com.zosh.model.Restaurant;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);
}
