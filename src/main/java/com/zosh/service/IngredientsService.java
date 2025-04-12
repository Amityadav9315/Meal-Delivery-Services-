package com.zosh.service;

import com.zosh.model.IngredientCategory;
import com.zosh.model.IngredientsItem;

import java.util.List;

public interface IngredientsService {

    public  IngredientsService createIngredientCategory(String name,Long restaurantId) throws Exception;

    public IngredientCategory findIngredientCategoryById(Long id) throws  Exception;

    public List<IngredientCategory> findIngredientCategoryByRestaurant(Long id) throws  Exception;

    public IngredientsItem createIngredientItem(Long restaurantId,String ingredientName,Long categoryId) throws Exception;

    public  List<IngredientsItem> findRestaurantIngredients(Long restaurantsId);

    public IngredientsItem updateStock(Long id) throws Exception;
}
