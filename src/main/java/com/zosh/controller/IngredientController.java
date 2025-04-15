package com.zosh.controller;

import com.zosh.model.IngredientCategory;
import com.zosh.model.IngredientsItem;
import com.zosh.request.IngredientCategoryRequest;
import com.zosh.request.IngredientRequest;
import com.zosh.service.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/ingredient")
public class IngredientController {

    @Autowired
    private IngredientsService ingredientsService;

    @PostMapping("/category")
    public ResponseEntity<IngredientCategory> createIngredientCategory(
            @RequestBody IngredientCategoryRequest req
            ) throws  Exception{
         IngredientCategory item= (IngredientCategory) ingredientsService.createIngredientCategory(req.getName(), req.getRestaurantId());
         return  new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<IngredientsItem> createIngredientItem(
            @RequestBody IngredientRequest req
    ) throws  Exception{
        IngredientsItem item= ingredientsService.createIngredientItem(req.getRestaurantId(), req.getName(), req.getCategoryId());
        return  new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @PutMapping("/{id}/stock")
    public ResponseEntity<IngredientsItem> updateIngredientStock(
            @RequestBody  Long id
    ) throws  Exception{
        IngredientsItem item= ingredientsService.updateStock(id);
        return  new ResponseEntity<>(item, HttpStatus.OK);
    }

    @GetMapping("/restaurant/{id}")
    public ResponseEntity<List<IngredientsItem>>getRestaurantIngredient(
            @RequestBody  Long id
    ) throws  Exception{
        List<IngredientsItem> items= ingredientsService.findRestaurantIngredients(id);
        return  new ResponseEntity<>(items, HttpStatus.OK);
    }
}
