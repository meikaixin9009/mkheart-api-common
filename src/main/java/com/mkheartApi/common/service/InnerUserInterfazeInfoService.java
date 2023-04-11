package com.mkheartApi.common.service;

/**
 *
 */
public interface InnerUserInterfazeInfoService {

    /**
     * 调用接口统计
     * @param interfazeInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfazeInfoId, long userId);
}
