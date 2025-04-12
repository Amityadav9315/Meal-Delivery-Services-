package com.zosh.service;


import com.zosh.model.IngredientCategory;
import com.zosh.model.IngredientsItem;
import com.zosh.model.Restaurant;
import com.zosh.repository.IngredientCategoryRepository;
import com.zosh.repository.IngredientItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImp implements  IngredientsService {

    @Autowired
    private IngredientItemRepository ingredientItemRepository;

    @Autowired
    private IngredientCategoryRepository ingredientCategoryRepository;

    @Autowired
    private  RestaurantService restaurantService;

    @Override
    public IngredientsService createIngredientCategory(String name, Long restaurantId) throws Exception {

        Restaurant restaurant=
        return null;
    }

    @Override
    public IngredientCategory findIngredientCategoryById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<IngredientCategory> findIngredientCategoryByRestaurant(Long id) throws Exception {
        return List.of();
    }

    @Override
    public IngredientsItem createIngredientItem(Long restaurantId, String ingredientName, Long categoryId) throws Exception {
        return null;
    }

    @Override
    public List<IngredientsItem> findRestaurantIngredients(Long restaurantsId) {
        return List.of();
    }

    @Override
    public IngredientsItem updateStock(Long id) throws Exception {
        return null;
    }
}
