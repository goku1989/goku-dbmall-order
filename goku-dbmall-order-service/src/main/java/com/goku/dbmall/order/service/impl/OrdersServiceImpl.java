package com.goku.dbmall.order.service.impl;

import com.goku.dbmall.order.dao.mapper.OrderItemsMapper;
import com.goku.dbmall.order.dao.mapper.OrdersMapper;
import com.goku.dbmall.order.dao.po.OrderItems;
import com.goku.dbmall.order.dao.po.Orders;
import com.goku.dbmall.order.dto.OrderItemsDTO;
import com.goku.dbmall.order.dto.OrdersDTO;
import com.goku.dbmall.order.manager.OrdersManager;
import com.goku.dbmall.order.service.OrdersService;
import com.goku.foundation.utils.CommonUtil;
import com.goku.foundation.utils.POUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.goku.dbmall.order.common.constant.CustomConstants.*;

@Slf4j
@Service
public class OrdersServiceImpl implements OrdersService {

    @Resource
    private OrdersManager ordersManager;

    @Resource
    private OrdersMapper ordersMapper;
    @Resource
    private OrderItemsMapper orderItemsMapper;

    @Override
    public Integer insertOrders(OrdersDTO ordersDTO) {
        Orders orders = CommonUtil.convert(ordersDTO, Orders.class);
        POUtils.initCreatPO(orders);
        String basicGkcode = GK_ORDERS + CommonUtil.getIdByUUId();
        orders.setGkcode(basicGkcode);

        List<OrderItems> orderItems = new ArrayList<>();
        Optional.ofNullable(ordersDTO.getOrderItemsDTOS()).filter(CollectionUtils::isNotEmpty).ifPresent(as -> {
            as.forEach(e -> e.setOrdersGkcode(basicGkcode));
            orderItems.addAll(CommonUtil.convertList(as, OrderItems.class));
        });

        ordersManager.insertOrders(orders, orderItems);
        return 1;
    }
}
