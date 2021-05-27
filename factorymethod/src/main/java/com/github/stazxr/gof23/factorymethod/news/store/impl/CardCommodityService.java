package com.github.stazxr.gof23.factorymethod.news.store.impl;

import com.alibaba.fastjson.JSON;
import com.github.stazxr.gof23.factorymethod.card.IQiYiCardService;
import com.github.stazxr.gof23.factorymethod.news.store.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class CardCommodityService implements ICommodity {
    // 模拟注入
    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        log.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        log.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
