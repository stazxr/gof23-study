package com.github.stazxr.gof23.factorymethod.news;

import com.github.stazxr.gof23.factorymethod.AwardType;
import com.github.stazxr.gof23.factorymethod.news.store.ICommodity;
import com.github.stazxr.gof23.factorymethod.news.store.impl.CardCommodityService;
import com.github.stazxr.gof23.factorymethod.news.store.impl.CouponCommodityService;
import com.github.stazxr.gof23.factorymethod.news.store.impl.GoodsCommodityService;

public class StoreFactory {
    public ICommodity getCommodityService(AwardType commodityType) {
        if (null == commodityType) return null;
        if (AwardType.Coupon == commodityType) return new CouponCommodityService();
        if (AwardType.Good == commodityType) return new GoodsCommodityService();
        if (AwardType.IQiYiCard == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
