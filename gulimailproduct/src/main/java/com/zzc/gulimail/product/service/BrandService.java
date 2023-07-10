package com.zzc.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzc.common.utils.PageUtils;
import com.zzc.gulimail.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zzc
 * @email 3210696396@qq.com
 * @date 2023-07-09 19:14:50
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

