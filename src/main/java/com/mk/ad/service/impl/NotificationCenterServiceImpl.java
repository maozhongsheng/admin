package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.NotificationCenterMapper;
import com.mk.ad.service.NotificationCenterService;
import com.mk.ad.utils.IDGen;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.NotificationCenter;
import com.mk.ad.vo.NotificationCenterExample;
import com.mk.ad.vo.Request.NotificationCenterRequestDTO;
import com.mk.ad.vo.Response.NotificationCenterResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:22
 */
@Slf4j
@Service
@Repository
public class NotificationCenterServiceImpl implements NotificationCenterService {

    @Autowired
    private NotificationCenterMapper notificationCenterMapper;


    @Override
    public LarkPageInfoVo<NotificationCenterResponseDTO> getNotificationCenterList(NotificationCenterRequestDTO notificationCenterRequestDTO) {
        NotificationCenterExample example = new NotificationCenterExample();
        NotificationCenterExample.Criteria criteria = example.createCriteria();
        if(0 != notificationCenterRequestDTO.getType()){
            criteria.andTypeEqualTo(notificationCenterRequestDTO.getType());
        }
        example.setOrderByClause("top,create_time desc");
        criteria.andIs_deleteEqualTo(0);

        PageHelper.startPage(notificationCenterRequestDTO.getPage(),notificationCenterRequestDTO.getLimit());
        List<NotificationCenter> NotificationCenterList = notificationCenterMapper.selectByExample(example);
        PageInfo<NotificationCenter> pageInfo = new PageInfo<>(NotificationCenterList);
        List<NotificationCenterResponseDTO> list = NotificationCenterList.stream().map(msg ->{
            NotificationCenterResponseDTO event = new NotificationCenterResponseDTO();
            event.setId(msg.getId());
            event.setStatus(msg.getStatus());
            event.setType(msg.getType());
            event.setNotification_title(msg.getNotification_title());
            event.setNotice_text(msg.getNotice_text());
            event.setTop(msg.getTop());
            event.setCreate_time(msg.getCreate_time());
            event.setIs_delete(msg.getIs_delete());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<NotificationCenterResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), notificationCenterRequestDTO.getLimit(), notificationCenterRequestDTO.getPage());
    }

    @Override
    public Integer topNotificationCenter(NotificationCenterRequestDTO notificationCenterRequestDTO) {
        NotificationCenter notificationCenter = new NotificationCenter();
        notificationCenter.setId(notificationCenterRequestDTO.getId());
        notificationCenter.setTop(notificationCenterRequestDTO.getTop());
        return notificationCenterMapper.updateByPrimaryKeySelective(notificationCenter);
    }

    @Override
    public Integer deleteNotificationCenter(NotificationCenterRequestDTO notificationCenterRequestDTO) {
        NotificationCenter notificationCenter = new NotificationCenter();
        notificationCenter.setId(notificationCenterRequestDTO.getId());
        notificationCenter.setIs_delete(1);
        return notificationCenterMapper.updateByPrimaryKeySelective(notificationCenter);
    }

    @Override
    public Integer addNotificationCenter(NotificationCenterRequestDTO notificationCenterRequestDTO) {
        NotificationCenter notificationCenter = new NotificationCenter();
        notificationCenter.setId(Integer.valueOf(IDGen.generateNumber()));
        notificationCenter.setTop(1);
        notificationCenter.setUser_id("1");
        notificationCenter.setIs_delete(0);
        notificationCenter.setCreate_time(new Date());
        notificationCenter.setStatus(2);
        notificationCenter.setType(notificationCenterRequestDTO.getType());
        notificationCenter.setNotification_title(notificationCenterRequestDTO.getNotification_title());
        notificationCenter.setNotice_text(notificationCenterRequestDTO.getNotice_text());
        return notificationCenterMapper.insertSelective(notificationCenter);
    }


}