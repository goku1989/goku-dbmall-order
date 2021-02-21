package com.goku.dbmall.order.manager;

import com.goku.dbmall.order.dao.mapper.OrderItemsMapper;
import com.goku.dbmall.order.dao.mapper.OrdersMapper;
import com.goku.dbmall.order.dao.po.OrderItems;
import com.goku.dbmall.order.dao.po.Orders;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Component
public class OrdersManager {
    @Resource
    private OrdersMapper ordersMapper;

    @Resource
    private OrderItemsMapper orderItemsMapper;

    @Transactional
    public boolean insertOrders(Orders orders, List<OrderItems> orderItems) {
        if (null != orders) {
            ordersMapper.insert(orders);
            Optional.ofNullable(orderItems).filter(CollectionUtils::isNotEmpty)
                    .ifPresent(as -> orderItemsMapper.insertList(as));
        }
        return true;
    }
}
