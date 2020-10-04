package com.southwind.phone_store_springboot.service.impl;

import com.southwind.phone_store_springboot.service.PhoneService;
import com.southwind.phone_store_springboot.vo.DataVO;
import com.southwind.phone_store_springboot.vo.PhoneInfoVO;
import com.southwind.phone_store_springboot.vo.SpecsPackageVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PhoneServiceImplTest {

    @Autowired
    private PhoneService phoneService;

    @Test
    void findDataVO(){
        DataVO dataVO = phoneService.findDataVO();
        System.out.println(dataVO);
    }

    @Test
    void findPhoneInfoVOByCategoryType(){
        List<PhoneInfoVO> list = phoneService.findPhoneInfoVOByCategoryType(1);
    }

    @Test
    void findSku(){
        SpecsPackageVO specsPackageVO = phoneService.findSpecsByPhoneId(1);
        int id = 0;
    }

    @Test
    void subStock() {
    }
}