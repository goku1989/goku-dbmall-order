package com.goku.dbmall.order.dao.po;

import com.goku.foundation.utils.BasePO;
import lombok.Data;

import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Table(name="orders")
public class Orders extends BasePO {

    private String gkcode;

    private String userGkcode;

    private String receiverName;

    private String receiverMobile;

    private String receiverAddress;

    private BigDecimal totalAmount;

    private BigDecimal realPayAmount;

    private String leftMsg;

}