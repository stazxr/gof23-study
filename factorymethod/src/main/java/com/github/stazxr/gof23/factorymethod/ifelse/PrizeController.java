package com.github.stazxr.gof23.factorymethod.ifelse;

import com.alibaba.fastjson.JSON;
import com.github.stazxr.gof23.factorymethod.AwardReq;
import com.github.stazxr.gof23.factorymethod.AwardRes;
import com.github.stazxr.gof23.factorymethod.AwardType;
import com.github.stazxr.gof23.factorymethod.card.IQiYiCardService;
import com.github.stazxr.gof23.factorymethod.coupon.CouponResult;
import com.github.stazxr.gof23.factorymethod.coupon.CouponService;
import com.github.stazxr.gof23.factorymethod.goods.DeliverReq;
import com.github.stazxr.gof23.factorymethod.goods.GoodsService;
import lombok.extern.slf4j.Slf4j;

/**
 * 模拟发奖服务
 */
@Slf4j
public class PrizeController {
    /**
     * 给用户发奖接口
     *
     * @param req 请求信息
     * @return AwardRes
     */
    public AwardRes awardToUser(AwardReq req) {
        String reqJson = JSON.toJSONString(req);
        AwardRes awardRes;
        try {
            log.info("奖品发放开始，uId: {}，req: {}", req.getUId(), reqJson);

            // 按照不同类型方法商品[优惠券、实物商品、第三方兑换卡(爱奇艺)]
            if (AwardType.Coupon.equals(req.getAwardType())) {
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(req.getUId(), req.getAwardNumber(), req.getBizId());
                if ("0000".equals(couponResult.getCode())) {
                    awardRes = new AwardRes("0000", "发放成功");
                } else {
                    awardRes = new AwardRes("0001", couponResult.getInfo());
                }
            } else if (AwardType.Good.equals(req.getAwardType())) {
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUserName(queryUserName(req.getUId()));
                deliverReq.setUserPhone(queryUserPhoneNumber(req.getUId()));
                deliverReq.setSku(req.getAwardNumber());
                deliverReq.setOrderId(req.getBizId());
                deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
                deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
                deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
                Boolean isSuccess = goodsService.deliverGoods(deliverReq);
                if (isSuccess) {
                    awardRes = new AwardRes("0000", "发放成功");
                } else {
                    awardRes = new AwardRes("0001", "发放失败");
                }
            } else if (AwardType.IQiYiCard.equals(req.getAwardType())) {
                String bindMobileNumber = queryUserPhoneNumber(req.getUId());
                IQiYiCardService iQiYiCardService = new IQiYiCardService();
                iQiYiCardService.grantToken(bindMobileNumber, req.getAwardNumber());
                awardRes = new AwardRes("0000", "发放成功");
            } else {
                awardRes = new AwardRes("0001", "不支持的奖品类型");
            }
            log.info("奖品发放完成，uId: {}", req.getUId());
        } catch (Exception e) {
            log.error("奖品发放失败，uId: {}，req:{}", req.getUId(), reqJson, e);
            awardRes = new AwardRes("0001", e.getMessage());
        }
        return awardRes;
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}
