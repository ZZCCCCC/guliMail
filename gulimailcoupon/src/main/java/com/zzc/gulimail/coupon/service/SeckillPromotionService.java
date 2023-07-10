package com.zzc.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzc.common.utils.PageUtils;
import com.zzc.gulimail.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author zzc
 * @email 3210696396@qq.com
 * @date 2023-07-09 19:50:37
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

