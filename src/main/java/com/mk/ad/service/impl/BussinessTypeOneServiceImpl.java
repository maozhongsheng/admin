package com.mk.ad.service.impl;

import com.mk.ad.mapper.BussinessTypeOneMapper;
import com.mk.ad.mapper.mymapper.MyBussinessTypeOneMapper;
import com.mk.ad.service.BussinessTypeOneService;
import com.mk.ad.vo.BussinessTypeOne;
import com.mk.ad.vo.Request.BussinessTypeOneRequestDTO;
import com.mk.ad.vo.Response.BussinessTypeOneResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * 一级类型
 *
 * @author gj
 * @version 1.0
 * @date 2021/1/28 13:16
 */
@Slf4j
@Service
@Repository
public class BussinessTypeOneServiceImpl implements BussinessTypeOneService {

    @Autowired
    BussinessTypeOneMapper bussinessTypeOneMapper;

    @Autowired
    MyBussinessTypeOneMapper myBussinessTypeOneMapper;

    @Override
    public List<BussinessTypeOneResponseDTO> getBussinessType(BussinessTypeOneRequestDTO bussinessTypeOneRequestDTO) {
        List<BussinessTypeOneResponseDTO> list1 = new ArrayList<>();
        List<BussinessTypeOne> list = myBussinessTypeOneMapper.selectBussinessType(bussinessTypeOneRequestDTO);
        for (BussinessTypeOne bussinessTypeOne:list){
            BussinessTypeOneResponseDTO bussinessTypeOneResponseDTO = new BussinessTypeOneResponseDTO();
            bussinessTypeOneResponseDTO.setId(bussinessTypeOne.getId());
            bussinessTypeOneResponseDTO.setTypeName(bussinessTypeOne.getType_name());
            list1.add(bussinessTypeOneResponseDTO);
        }
        return list1;
    }
}
