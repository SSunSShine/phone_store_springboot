package com.southwind.phone_store_springboot.service;

import com.southwind.phone_store_springboot.form.AddressForm;
import com.southwind.phone_store_springboot.vo.AddressVO;

import java.util.List;

public interface AddressService {
    public List<AddressVO> findAll();
    public void saveOrUpdate(AddressForm addressForm);
}
