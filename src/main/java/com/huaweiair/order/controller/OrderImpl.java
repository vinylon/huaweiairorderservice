package com.huaweiair.order.controller;

import com.huaweiair.order.model.FlightFlag;
import com.huaweiair.order.model.FlightOrder;
import io.servicecomb.provider.pojo.RpcSchema;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoCodegen", date = "2017-11-04T17:20:51.183+08:00")

@RpcSchema(schemaId = "order")
public class OrderImpl implements Order{

    @Autowired
    private OrderDelegate orderDelegate;


    public Boolean createOrders(FlightFlag order) {

        return orderDelegate.createOrders(order);
    }


    public Boolean deleteOrder(String orderId) {

        return orderDelegate.deleteOrder(orderId);
    }


    public List<FlightOrder> getAllOrders(String userId) {

        return orderDelegate.getAllOrders(userId);
    }


    public Boolean modifyOrder(String orderId, Integer action) {

        return orderDelegate.modifyOrder(orderId, action);
    }

}
