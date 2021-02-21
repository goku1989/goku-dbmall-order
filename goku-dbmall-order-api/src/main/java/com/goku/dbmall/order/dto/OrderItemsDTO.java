package com.goku.dbmall.order.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderItemsDTO {
    private String gkcode;

    private String ordersGkcode;

    private String goodsGkcode;

    private String goodsImg;

    private String goodsName;

    private String goodsSpecName;

    private BigDecimal dealPrice;

    private Integer buyCounts;
}
