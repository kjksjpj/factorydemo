package com.example.factorydemo.service;

import com.example.factorydemo.mapper.OrderMapper;
import com.example.factorydemo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
    public List<Order> queryAllOrder() {
        return orderMapper.queryAllOrder();
    }

    public int addOrder(Order order) {
        return orderMapper.addOrder(order);
    }

    public Order queryOrderById(int orderId) {
        return orderMapper.queryOrderById(orderId);
    }

    public int updateOrder(Order order) {
        return orderMapper.updateOrder(order);
    }

    public int delOrder(Integer orderId) {
        return orderMapper.deleteOrderByOrderId(orderId);
    }
}
