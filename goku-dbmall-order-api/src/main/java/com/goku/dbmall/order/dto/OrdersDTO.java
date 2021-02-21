package com.goku.dbmall.order.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrdersDTO {
    private String gkcode;

    private String userGkcode;

    private String receiverName;

    private String receiverMobile;

    private String receiverAddress;

    private BigDecimal totalAmount;

    private BigDecimal realPayAmount;

    private String leftMsg;

    List<OrderItemsDTO> orderItemsDTOS;
}
