package com.zosh.service;

import com.zosh.model.Category;
import com.zosh.model.Restaurant;
import com.zosh.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public Category createCategory(String name, Long userId) throws Exception {
        Restaurant restaurant=restaurantService.findRestaurantById(userId);
        Category category=new Category();
        category.setName(name);
        category.setRestaurant(restaurant);
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> findCategoryByRestaurantId(Long id) throws Exception {

        return categoryRepository.findByRestaurantId(id);
    }

    @Override
    public Category findCategoryBtId(Long id) throws Exception {
        return null;
    }
}
