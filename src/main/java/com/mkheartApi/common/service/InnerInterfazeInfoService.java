package com.mkheartApi.common.service;


import com.mkheartApi.common.model.entity.InterfazeInfo;

/**
 *
 */
public interface InnerInterfazeInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     */
    InterfazeInfo getInterfazeInfo(String path, String method);
}
