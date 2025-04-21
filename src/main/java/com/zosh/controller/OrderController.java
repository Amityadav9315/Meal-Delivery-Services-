package com.zosh.controller;


import com.zosh.model.CartItem;
import com.zosh.model.Order;
import com.zosh.model.User;
import com.zosh.request.AddCartItemRequest;
import com.zosh.request.OrderRequest;
import com.zosh.service.OrderService;
import com.zosh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderService orderService;

    private UserService userService;

    @PutMapping("/order")
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest req,
                                             @RequestHeader("Authorization") String jwt) throws  Exception{
        User user=userService.findUserByJwtToken(jwt);
        Order order=orderService.createOrder(req,user);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

}
