package com.mkheartApi.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 接口发布/下线请求
 *
 * @author yupi
 */
@Data
public class InterfazeIdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}