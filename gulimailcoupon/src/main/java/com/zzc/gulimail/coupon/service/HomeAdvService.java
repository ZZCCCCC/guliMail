package com.zzc.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzc.common.utils.PageUtils;
import com.zzc.gulimail.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author zzc
 * @email 3210696396@qq.com
 * @date 2023-07-09 19:50:37
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

