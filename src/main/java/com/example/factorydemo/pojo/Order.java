package com.example.factorydemo.pojo;
@SuppressWarnings("all")
public class Order {
    private int orderId;
    private String orderTitle;
    private String orderContent;
    private String orderSpecification;
    private int orderQuantity;
    private String orderInitiator;
    private String orderRecipient;
    private String orderPreMoney;
    private String orderGreMoney;
    private String orderLastMoney;
    private String orderNotes;
    private String orderCreateTime;
    private String orderDeadTime;
    private String orderState;
    public Order() {
    }

    public Order(int orderId, String orderTitle, String orderContent, String orderSpecification, int orderQuantity, String orderInitiator, String orderRecipient, String orderPreMoney, String orderGreMoney, String orderLastMoney, String orderNotes, String orderCreateTime, String orderDeadTime, String orderState) {
        this.orderId = orderId;
        this.orderTitle = orderTitle;
        this.orderContent = orderContent;
        this.orderSpecification = orderSpecification;
        this.orderQuantity = orderQuantity;
        this.orderInitiator = orderInitiator;
        this.orderRecipient = orderRecipient;
        this.orderPreMoney = orderPreMoney;
        this.orderGreMoney = orderGreMoney;
        this.orderLastMoney = orderLastMoney;
        this.orderNotes = orderNotes;
        this.orderCreateTime = orderCreateTime;
        this.orderDeadTime = orderDeadTime;
        this.orderState = orderState;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderTitle() {
        return orderTitle;
    }

    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }

    public String getOrderSpecification() {
        return orderSpecification;
    }

    public void setOrderSpecification(String orderSpecification) {
        this.orderSpecification = orderSpecification;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getOrderInitiator() {
        return orderInitiator;
    }

    public void setOrderInitiator(String orderInitiator) {
        this.orderInitiator = orderInitiator;
    }

    public String getOrderRecipient() {
        return orderRecipient;
    }

    public void setOrderRecipient(String orderRecipient) {
        this.orderRecipient = orderRecipient;
    }

    public String getOrderPreMoney() {
        return orderPreMoney;
    }

    public void setOrderPreMoney(String orderPreMoney) {
        this.orderPreMoney = orderPreMoney;
    }

    public String getOrderGreMoney() {
        return orderGreMoney;
    }

    public void setOrderGreMoney(String orderGreMoney) {
        this.orderGreMoney = orderGreMoney;
    }

    public String getOrderLastMoney() {
        return orderLastMoney;
    }

    public void setOrderLastMoney(String orderLastMoney) {
        this.orderLastMoney = orderLastMoney;
    }

    public String getOrderNotes() {
        return orderNotes;
    }

    public void setOrderNotes(String orderNotes) {
        this.orderNotes = orderNotes;
    }

    public String getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderDeadTime() {
        return orderDeadTime;
    }

    public void setOrderDeadTime(String orderDeadTime) {
        this.orderDeadTime = orderDeadTime;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderTitle='" + orderTitle + '\'' +
                ", orderContent='" + orderContent + '\'' +
                ", orderSpecification='" + orderSpecification + '\'' +
                ", orderQuantity=" + orderQuantity +
                ", orderInitiator='" + orderInitiator + '\'' +
                ", orderRecipient='" + orderRecipient + '\'' +
                ", orderPreMoney='" + orderPreMoney + '\'' +
                ", orderGreMoney='" + orderGreMoney + '\'' +
                ", orderLastMoney='" + orderLastMoney + '\'' +
                ", orderNotes='" + orderNotes + '\'' +
                ", orderCreateTime='" + orderCreateTime + '\'' +
                ", orderDeadTime='" + orderDeadTime + '\'' +
                ", orderState='" + orderState + '\'' +
                '}';
    }
}
