package com.zzc.gulimail.product.dao;

import com.zzc.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zzc
 * @email 3210696396@qq.com
 * @date 2023-07-09 19:14:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
