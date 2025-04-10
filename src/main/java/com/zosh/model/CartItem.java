package com.zosh.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
fdeqjkglewf
    efdjbblkew

    @ManyToOne
    @JsonIgnore
    private  Cart cart;


    @ManyToOne
    private Food food;

    private  int quantity;

    private List<String> ingredients;

    private  Long totalPrice;

}
