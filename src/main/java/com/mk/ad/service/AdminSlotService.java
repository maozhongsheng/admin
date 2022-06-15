package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminSlot;
import com.mk.ad.vo.Request.AdminSlotRequestDTO;
import com.mk.ad.vo.Response.AdminSlotResponseDTO;

import java.util.List;
import java.util.Map;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:22
 */
public interface AdminSlotService {

    LarkPageInfoVo<AdminSlotResponseDTO> getSlotList(AdminSlotRequestDTO adminSlotRequestDTO);

    Integer insertSlot(AdminSlot adminSlot);

    Integer UpdateSlot(AdminSlot adminSlot);

    AdminSlotRequestDTO getSlotInfo(Long id);

    int removeSlot(List<Long> list);

    Integer upDataSlotStatus(AdminSlotRequestDTO adminSlotRequestDTO);


    List<Map> adminSlotCreativeTemplate(List id);
}
