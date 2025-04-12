package com.zosh.service;

import com.zosh.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {



    @Override
    public Category createCategory(String name, Long userId) {
        return null;
    }

    @Override
    public List<Category> findCategoryByRestaurantId(Long id) throws Exception {
        return List.of();
    }

    @Override
    public Category findCategoryBtId(Long id) throws Exception {
        return null;
    }
}
