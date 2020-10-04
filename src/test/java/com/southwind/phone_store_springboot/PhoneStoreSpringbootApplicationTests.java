package com.southwind.phone_store_springboot;

import com.southwind.phone_store_springboot.entity.PhoneCategory;
import com.southwind.phone_store_springboot.repository.PhoneCategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PhoneStoreSpringbootApplicationTests {

    @Autowired
    private PhoneCategoryRepository phoneCategoryRepository;

    @Test
    void contextLoads() {
        PhoneCategory byCategoryType = phoneCategoryRepository.findByCategoryType(1);
        System.out.println(byCategoryType);
    }


}
