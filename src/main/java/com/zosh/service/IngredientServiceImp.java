package com.zosh.service;


import com.zosh.model.IngredientCategory;
import com.zosh.model.IngredientsItem;
import com.zosh.model.Restaurant;
import com.zosh.repository.IngredientCategoryRepository;
import com.zosh.repository.IngredientItemRepository;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

        Restaurant restaurant=restaurantService.findRestaurantById(restaurantId);
        IngredientCategory category=new IngredientCategory();
        category.setRestaurant(restaurant);
        category.setName(name);
        return (IngredientsService) ingredientCategoryRepository.save(category);
    }

    @Override
    public IngredientCategory findIngredientCategoryById(Long id) throws Exception {
        Optional<IngredientCategory> opt=ingredientCategoryRepository.findById(id);

        if(opt.isEmpty()){
            throw  new Exception("ingredient category not found");
        }
        return opt.get();
    }

    @Override
    public List<IngredientCategory> findIngredientCategoryByRestaurant(Long id) throws Exception {
        return ingredientCategoryRepository.findRestaurantId(id);
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
