package com.zzc.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzc.common.utils.PageUtils;
import com.zzc.gulimail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zzc
 * @email 3210696396@qq.com
 * @date 2023-07-09 20:00:01
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

