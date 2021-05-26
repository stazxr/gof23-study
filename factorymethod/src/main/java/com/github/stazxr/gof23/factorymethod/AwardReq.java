package com.github.stazxr.gof23.factorymethod;

import lombok.Data;

import java.util.Map;

@Data
public class AwardReq {
    /**
     * 用户唯一ID
     */
    private String uId;

    /**
     * 奖品类型(可以用枚举定义)；优惠券、实物商品、第三方兑换卡(爱奇艺)
     */
    private AwardType awardType;

    /**
     * 奖品编号；sku、couponNumber、cardId
     */
    private String awardNumber;

    /**
     * 业务ID，防重复
     */
    private String bizId;

    /**
     * 扩展信息
     */
    private Map<String, String> extMap;
}
