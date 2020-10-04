package com.southwind.phone_store_springboot.repository;

import com.southwind.phone_store_springboot.entity.PhoneSpecs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PhoneSpecsRepositoryTest {

    @Autowired
    private PhoneSpecsRepository repository;

    @Test
    void findAll(){
        List<PhoneSpecs> list = repository.findAll();
        for (PhoneSpecs specs : list) {
            System.out.println(specs);
        }
    }
}