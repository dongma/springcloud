package com.netflix.cloud.product.repository;

import com.netflix.cloud.product.dataobject.ProductInfo;
import com.netflix.cloud.product.repository.ProductInfoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findProductInfoByProductStatus() {
        // 查询所有在线的商品信息.
        List<ProductInfo> productInfoList = productInfoRepository.findProductInfoByProductStatus(0);
        assert productInfoList.size() > 0;
    }

    @Test
    public void findByProductIdIn() {
        List<ProductInfo> productInfoList = productInfoRepository.findByProductIdIn(Arrays.asList("157875196366160022", "157875227953464068"));
        assert productInfoList.size() > 0;
    }
}