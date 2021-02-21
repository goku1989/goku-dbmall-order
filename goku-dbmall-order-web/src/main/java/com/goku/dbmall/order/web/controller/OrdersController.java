package com.goku.dbmall.order.web.controller;

import com.goku.dbmall.order.dto.OrdersDTO;
import com.goku.dbmall.order.service.OrdersService;
import com.goku.foundation.response.BaseResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Resource
    private OrdersService ordersService;

    @PostMapping(value = "insertOrders", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<Integer> insertOrders(@RequestBody OrdersDTO ordersDTO) {
        return new BaseResponse<>(ordersService.insertOrders(ordersDTO));
    }
}
