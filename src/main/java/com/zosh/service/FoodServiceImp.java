package com.zosh.service;

import com.zosh.model.Category;
import com.zosh.model.Food;
import com.zosh.model.Restaurant;
import com.zosh.repository.FoodRepository;
import com.zosh.request.CreateFoodRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.server.ExportException;
import java.util.List;


@Service
public class FoodServiceImp  implements  FoodService{

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant) {
        Food food =new Food();
        food.setFoodCategory(category);
        food.setRestaurant(restaurant);
        food.setDescription(req.getDescription());
        food.setImages(req.getImages());
        food.setName(req.getName());
        food.setPrice(req.getPrice());
        food.setIngredients(req.getIngredientsItems());
        food.setSeasonal(req.isSeasonal());
        food.setVegetarian(req.isVegetarian());
         Food saveFood = foodRepository.save(food);
         restaurant.getFoods().add(saveFood);
         return saveFood;
    }

    @Override
    public void deleteFood(Long foodId) throws Exception {

        Food food=findFoodById(foodId);
        food.setRestaurant(null);
        foodRepository.save(food);

    }

    @Override
    public List<Food> getRestaurantsFood(Long restaurantId,
                                         boolean isVegitarain,
                                         boolean isNonveg,
                                         boolean isSeasonal,
                                         String foodCategory) {
        List<Food> foods=foodRepository.findByRestaurantId(restaurantId);
        if(isVegitarain){
            foods=filterByVegetarian(foods,isVegitarain);
        }
        if(isNonveg){
            foods=filterByNonveg(foods,isNonveg);
        }
        if(isSeasonal){
            foods=filterBySeasonal(foods,isSeasonal);

        }
        if(foodCategory!=null && !foodCategory.equals("")){
          foods=filterByCategory(foods,foodCategory);
        }

        return foods;
    }

    private List<Food> filterByCategory(List<Food> foods, String foodCategory) {

    }

    private List<Food> filterBySeasonal(List<Food> foods, boolean isSeasonal) {
    }

    private List<Food> filterByNonveg(List<Food> foods, boolean isNonveg) {
    }

    private List<Food> filterByVegetarian(List<Food> foods, boolean isVegitarain) {
    }

    @Override
    public List<Food> searchFood(String keyword) {
        return List.of();
    }

    @Override
    public Food findFoodById(Long foodId) throws Exception {
        return null;
    }

    @Override
    public Food updateAvailabilityStatus(Long foodId) throws ExportException {
        return null;
    }
}
