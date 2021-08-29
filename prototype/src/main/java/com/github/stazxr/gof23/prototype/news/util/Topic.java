package com.github.stazxr.gof23.prototype.news.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic {
    /**
     * 选项；A、B、C、D
     */
    private Map<String, String> option;

    /**
     * 答案；B
     */
    private String key;
}
