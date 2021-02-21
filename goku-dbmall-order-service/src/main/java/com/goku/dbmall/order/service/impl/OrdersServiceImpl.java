package com.goku.dbmall.order.service.impl;

import com.goku.dbmall.order.dao.mapper.OrdersMapper;
import com.goku.dbmall.order.service.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class OrdersServiceImpl implements OrdersService {

    @Resource
    private OrdersMapper ordersMapper;
}
