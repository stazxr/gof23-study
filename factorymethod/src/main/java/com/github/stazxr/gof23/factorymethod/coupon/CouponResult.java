package com.github.stazxr.gof23.factorymethod.coupon;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CouponResult {
    /**
     * 编码
     */
    private String code;

    /**
     * 描述
     */
    private String info;
}
