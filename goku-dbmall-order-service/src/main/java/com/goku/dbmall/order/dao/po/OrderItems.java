package com.goku.dbmall.order.dao.po;

import com.goku.foundation.utils.BasePO;
import lombok.Data;

import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
@Data
@Table(name="orders_items")
public class OrderItems extends BasePO {

    private String gkcode;

    private String ordersGkcode;

    private String goodsGkcode;

    private String goodsImg;

    private String goodsName;

    private String goodsSpecName;

    private BigDecimal dealPrice;

    private Integer buyCounts;

}