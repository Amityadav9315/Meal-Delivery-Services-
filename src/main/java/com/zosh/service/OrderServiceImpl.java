package com.zosh.service;

import com.zosh.model.Order;
import com.zosh.model.User;
import com.zosh.request.OrderRequest;

import java.util.List;

public class OrderServiceImpl implements  OrderService{
    @Override
    public Order createOrder(OrderRequest order, User user) {
        return null;
    }

    @Override
    public Order updateOrder(Long orderId, String orderStatus) throws Exception {
        return null;
    }

    @Override
    public void cancelOrder(Long orderId) throws Exception {

    }

    @Override
    public List<Order> getUsersOrder(Long userId) throws Exception {
        return List.of();
    }

    @Override
    public List<Order> getRestaurantOrder(Long restaurantId, String orderStatus) throws Exception {
        return List.of();
    }
}
