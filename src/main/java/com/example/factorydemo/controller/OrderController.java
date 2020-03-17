package com.example.factorydemo.controller;

import com.example.factorydemo.pojo.Order;
import com.example.factorydemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    //到所有订单页面
    @RequestMapping("/toAllOrderPage")
    public String toAllOrderPage(Model model) {
        List<Order> orderList = orderService.queryAllOrder();
        model.addAttribute("orderList", orderList);
        return "orderlist";
    }

    //到录入订单页面
    @RequestMapping("/addOrderPage")
    public String addOrderPage(){
        return "addOrderInfo";
    }

    //录入订单
    @RequestMapping("/addOrder")
    public String addOrder(Order order){
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        order.setOrderCreateTime(df.format(date));
        order.setOrderState("未完成");
        orderService.addOrder(order);
        return "redirect:/toAllOrderPage";
    }

    //到修改订单页面
    @RequestMapping("/toUpdateOrder/{orderId}")
    public String toUpdateOrder(@PathVariable(name="orderId") int orderId, Model model) {
        Order order = orderService.queryOrderById(orderId);
        model.addAttribute("order", order);
        return "updateOrder";
    }

    //修改订单
    @RequestMapping("/updateOrder")
    public String updateOrder(Order order) {
        System.out.println(order);
        int i = orderService.updateOrder(order);
        System.out.println(i);
        return "redirect:/toAllOrderPage";
    }

    //删除订单
    @RequestMapping("/delOrder/{orderId}")
    public String delOrder(@PathVariable(name = "orderId") Integer orderId, Model model){
        orderService.delOrder(orderId);
        return "redirect:/toAllOrderPage";
    }
}
