package com.zosh.repository;

import com.zosh.model.IngredientsItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientItemRepository extends JpaRepository<IngredientsItem,Long> {

}
