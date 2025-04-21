package com.zosh.service;

import com.zosh.model.Address;
import com.zosh.model.Order;
import com.zosh.model.User;
import com.zosh.repository.AddressRepository;
import com.zosh.repository.OrderRepository;
import com.zosh.repository.OrderitemRepository;
import com.zosh.request.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements  OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderitemRepository orderitemRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Order createOrder(OrderRequest order, User user) {
        Address shippAddress=order.getDeliveryAddress();

        Address saveAddress=addressRepository.save(shippAddress);

        if(!user.getAddresses().contains(saveAddress)){
            user.getAddresses().add(saveAddress);
        }
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
