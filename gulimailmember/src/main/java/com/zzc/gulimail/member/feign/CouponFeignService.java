package com.zzc.gulimail.member.feign;

import com.zzc.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: 赵智超
 * @date: 2023/07/09/22:21
 * @Description:
 */
@FeignClient("gulimail-coupon")
public interface CouponFeignService {
    @GetMapping("/coupon/coupon/member/list")
    public R memberTest();

}
