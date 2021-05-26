package com.github.stazxr.gof23.factorymethod.goods;

import lombok.Data;

@Data
public class DeliverReq {
    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户手机
     */
    private String userPhone;

    /**
     * 商品SKU
     */
    private String sku;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 收货人姓名
     */
    private String consigneeUserName;

    /**
     * 收货人手机
     */
    private String consigneeUserPhone;

    /**
     * 收获人地址
     */
    private String consigneeUserAddress;
}
