package com.zosh.service;

import com.zosh.model.Category;
import com.zosh.model.Food;
import com.zosh.model.Restaurant;
import com.zosh.request.CreateFoodRequest;

import java.rmi.server.ExportException;
import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId)  throws  Exception;

    public List<Food> getRestaurantsFood(Long restaurantId,
                                         boolean isVegitarain,
                                         boolean isNonVeg,
                                         boolean idSeasonal,
                                         String foodCategory);

    public  List<Food> searchFood(String keyword);
    public  Food findFoodById(Long foodId) throws  Exception;

    public Food updateAvailabilityStatus(Long foodId) throws ExportException;

}
