package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.NotificationCenterRequestDTO;
import com.mk.ad.vo.Response.NotificationCenterResponseDTO;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:22
 */
public interface NotificationCenterService {

    LarkPageInfoVo<NotificationCenterResponseDTO> getNotificationCenterList(NotificationCenterRequestDTO notificationCenterRequestDTO);

    Integer topNotificationCenter(NotificationCenterRequestDTO notificationCenterRequestDTO);

    Integer deleteNotificationCenter(NotificationCenterRequestDTO notificationCenterRequestDTO);

    Integer addNotificationCenter(NotificationCenterRequestDTO notificationCenterRequestDTO);
}
