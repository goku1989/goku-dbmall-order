package com.goku.dbmall.order.service;

import com.goku.dbmall.order.dto.OrderItemsDTO;
import com.goku.dbmall.order.dto.OrdersDTO;

public interface OrdersService {
    Integer insertOrders(OrdersDTO ordersDTO);
}
