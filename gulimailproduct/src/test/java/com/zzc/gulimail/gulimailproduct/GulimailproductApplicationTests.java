package com.zzc.gulimail.gulimailproduct;

import com.zzc.gulimail.product.GulimailproductApplication;
import com.zzc.gulimail.product.entity.BrandEntity;
import com.zzc.gulimail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = GulimailproductApplication.class)
@RunWith(SpringRunner.class)
class GulimailproductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("aa...");
        brandEntity.setName("aa");
        brandService.save(brandEntity);
    }

}
