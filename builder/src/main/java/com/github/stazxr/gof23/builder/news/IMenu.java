package com.github.stazxr.gof23.builder.news;

import com.github.stazxr.gof23.builder.Matter;

/**
 * 接⼝类中定义了填充各项物料的⽅法；
 *
 * 组装接口，需要组装那些对象
 */
public interface IMenu {
    /**
     * 吊顶
     */
    IMenu appendCeiling(Matter matter);

    /**
     * 涂料
     */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     */
    IMenu appendTile(Matter matter);

    /**
     * 明细
     */
    String getDetail();
}
