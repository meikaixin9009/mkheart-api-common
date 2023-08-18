package com.mkheartApi.common.service;

import com.mkheartApi.common.model.entity.UserInterfaceInfo;

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

    /**
     * 检查用户界面信息计数
     *
     * @param interfazeInfoId interfaze信息id
     * @param userId          用户id
     * @return {@link UserInterfaceInfo}
     */
    UserInterfaceInfo checkUserInterfaceInfoCount(long interfazeInfoId, long userId);
}
