package com.zzc.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzc.common.utils.PageUtils;
import com.zzc.gulimail.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author zzc
 * @email 3210696396@qq.com
 * @date 2023-07-09 20:11:53
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

