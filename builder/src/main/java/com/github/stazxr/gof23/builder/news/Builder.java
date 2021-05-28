package com.github.stazxr.gof23.builder.news;

import com.github.stazxr.gof23.builder.ceiling.LevelOneCeiling;
import com.github.stazxr.gof23.builder.ceiling.LevelTwoCeiling;
import com.github.stazxr.gof23.builder.coat.DuluxCoat;
import com.github.stazxr.gof23.builder.coat.LiBangCoat;
import com.github.stazxr.gof23.builder.floor.ShengXiangFloor;
import com.github.stazxr.gof23.builder.tile.DongPengTile;
import com.github.stazxr.gof23.builder.tile.MarcoPoloTile;

/**
 * 建造者类具体的各种组装由此类实现
 */
public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
            .appendCeiling(new LevelTwoCeiling())
            .appendCoat(new DuluxCoat())
            .appendFloor(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
            .appendCeiling(new LevelTwoCeiling())
            .appendCoat(new LiBangCoat())
            .appendTile(new MarcoPoloTile());
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
            .appendCeiling(new LevelOneCeiling())
            .appendCoat(new LiBangCoat())
            .appendTile(new DongPengTile());
    }
}
