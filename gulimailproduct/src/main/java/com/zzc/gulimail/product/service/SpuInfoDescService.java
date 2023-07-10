package com.zzc.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzc.common.utils.PageUtils;
import com.zzc.gulimail.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author zzc
 * @email 3210696396@qq.com
 * @date 2023-07-09 19:14:50
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

