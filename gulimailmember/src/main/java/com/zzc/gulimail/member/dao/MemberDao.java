package com.zzc.gulimail.member.dao;

import com.zzc.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zzc
 * @email 3210696396@qq.com
 * @date 2023-07-09 20:00:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
