package com.mk.ad.service.impl;


import com.mk.ad.mapper.BussinessTypeTwoMapper;
import com.mk.ad.mapper.mymapper.MyBussinessTypeTwoMapper;
import com.mk.ad.service.BussinessTypeTwoService;
import com.mk.ad.vo.BussinessTypeTwo;
import com.mk.ad.vo.Response.BussinessTypeTwoResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 二级类型
 *
 * @author gj
 * @version 1.0
 * @date 2021/1/28 13:16
 */
@Slf4j
@Service
@Repository
public class BussinessTypeTwoServiceImpl implements BussinessTypeTwoService {

    @Autowired
    BussinessTypeTwoMapper bussinessTypeTwoMapper;

    @Autowired
    MyBussinessTypeTwoMapper myBussinessTypeTwoMapper;

    @Override
    public List<BussinessTypeTwoResponseDTO> getBussinessTwoType(Integer typeId) {
        List<BussinessTypeTwoResponseDTO> list1 = new ArrayList<>();

        List<BussinessTypeTwo> list = myBussinessTypeTwoMapper.selectBussinessTwoType(typeId);

        for (BussinessTypeTwo bussinessTypeTwo:list){
            BussinessTypeTwoResponseDTO bussinessTypeTwoResponseDTO = new BussinessTypeTwoResponseDTO();
            bussinessTypeTwoResponseDTO.setId(bussinessTypeTwo.getId());
            bussinessTypeTwoResponseDTO.setCategoryName(bussinessTypeTwo.getCategory_name());
            list1.add(bussinessTypeTwoResponseDTO);
        }
        return list1;
    }
}
