package com.southwind.phone_store_springboot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
public class SpecsPackageVO {
    private Map<String,String> goods;
    private SkuVO sku;
}
