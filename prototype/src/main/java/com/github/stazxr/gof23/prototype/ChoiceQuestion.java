package com.github.stazxr.gof23.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * 单选题
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChoiceQuestion {
    /**
     * 题目
     */
    private String name;

    /**
     * 选项；A、B、C、D
     */
    private Map<String, String> option;

    /**
     * 答案；B
     */
    private String key;
}
