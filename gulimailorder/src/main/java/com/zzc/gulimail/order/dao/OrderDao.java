package com.zzc.gulimail.order.dao;

import com.zzc.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zzc
 * @email 3210696396@qq.com
 * @date 2023-07-09 20:08:06
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
