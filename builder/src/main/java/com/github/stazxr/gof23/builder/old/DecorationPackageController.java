package com.github.stazxr.gof23.builder.old;

import com.github.stazxr.gof23.builder.Matter;
import com.github.stazxr.gof23.builder.ceiling.LevelOneCeiling;
import com.github.stazxr.gof23.builder.ceiling.LevelTwoCeiling;
import com.github.stazxr.gof23.builder.coat.DuluxCoat;
import com.github.stazxr.gof23.builder.coat.LiBangCoat;
import com.github.stazxr.gof23.builder.floor.ShengXiangFloor;
import com.github.stazxr.gof23.builder.tile.DongPengTile;
import com.github.stazxr.gof23.builder.tile.MarcoPoloTile;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DecorationPackageController {
    /**
     * 根据装修面积和装修级别计算装修金额
     *
     * @param area  装修面积
     * @param level 装修级别
     * @return 装修详情
     */
    public String getMatterList(BigDecimal area, Integer level) {
        // 装修清单
        List<Matter> list = new ArrayList<Matter>();

        // 装修价格
        BigDecimal price = BigDecimal.ZERO;

        // 豪华欧式
        if (1 == level) {
            // 吊顶，二级顶;涂料，多乐士;地板，圣象
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            list.add(levelTwoCeiling);
            DuluxCoat duluxCoat = new DuluxCoat();
            list.add(duluxCoat);
            ShengXiangFloor shengXiangFloor = new ShengXiangFloor();
            list.add(shengXiangFloor);

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(duluxCoat.price()));
            price = price.add(area.multiply(shengXiangFloor.price()));
        }

        // 轻奢田园
        if (2 == level) {
            // 吊顶，二级顶;涂料，立邦;地砖，马可波罗
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            list.add(levelTwoCeiling);
            LiBangCoat liBangCoat = new LiBangCoat();
            list.add(liBangCoat);
            MarcoPoloTile marcoPoloTile = new MarcoPoloTile();
            list.add(marcoPoloTile);

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(marcoPoloTile.price()));
        }

        // 现代简约
        if (3 == level) {
            // 吊顶，二级顶;涂料，立邦;地砖，东鹏
            LevelOneCeiling levelOneCeiling = new LevelOneCeiling();
            list.add(levelOneCeiling);
            LiBangCoat liBangCoat = new LiBangCoat();
            list.add(liBangCoat);
            DongPengTile dongPengTile = new DongPengTile();
            list.add(dongPengTile);

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelOneCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(dongPengTile.price()));
        }

        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + level + "\r\n" +
                "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + " 元\r\n" +
                "房屋面积：" + area.doubleValue() + " 平米\r\n" +
                "材料清单：\r\n");

        for (Matter matter: list) {
            detail.append(matter.scene()).append("：").append(matter.brand()).append("、").append(matter.model()).append("、平米价格：").append(matter.price()).append(" 元。\n");
        }

        return detail.toString();
    }
}
