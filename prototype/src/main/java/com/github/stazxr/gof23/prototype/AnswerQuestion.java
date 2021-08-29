package com.github.stazxr.gof23.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 解答题
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnswerQuestion {
    /**
     * 问题
     */
    private String name;

    /**
     * 答案
     */
    private String key;
}
