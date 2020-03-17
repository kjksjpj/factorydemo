package com.example.factorydemo.mapper;

import com.example.factorydemo.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    //1.录入订单
    int addOrder(Order order);
    //2.查询所有订单信息
    List<Order> queryAllOrder();
    //3.根据id查询订单信息
    Order queryOrderById(@Param("orderId") int id);

    int updateOrder(Order order);

    int deleteOrderByOrderId(Integer orderId);
}
