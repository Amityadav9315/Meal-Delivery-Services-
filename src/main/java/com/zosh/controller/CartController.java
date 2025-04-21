package com.zosh.controller;

import com.zosh.model.CartItem;
import com.zosh.request.AddCartItemRequest;
import com.zosh.service.CartService;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CartController {

    @Autowired
    private CartService cartService;

    @PutMapping("/cart/add")
    public ResponseEntity<CartItem> addItemToCart(@RequestBody AddCartItemRequest req,
                                                  @RequestHeader("Authorization") String jwt) throws  Exception{
        CartItem cartItem=cartService.addItemToCart(req,jwt);
        return new ResponseEntity<>(cartItem, HttpStatus.OK);
    }
}
