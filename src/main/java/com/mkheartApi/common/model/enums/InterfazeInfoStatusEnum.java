package com.mkheartApi.common.model.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * interfaze信息状态枚举
 *
 * @author Administrator
 * @date 2023/02/25
 */
public enum InterfazeInfoStatusEnum {

    DOWNINTERFAZE("关闭", 0),
    ONLINE("上线", 1),
    OFFLINE("下线", 2);

    private final String text;

    private final int value;

    InterfazeInfoStatusEnum(String text, int value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<Integer> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

}
