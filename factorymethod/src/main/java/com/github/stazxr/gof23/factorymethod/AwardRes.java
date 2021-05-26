package com.github.stazxr.gof23.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AwardRes {
    /**
     * 编码
     */
    private String code;

    /**
     * 描述
     */
    private String info;
}
