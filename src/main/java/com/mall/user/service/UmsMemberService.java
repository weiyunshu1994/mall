package com.mall.user.service;

import com.mall.user.common.api.CommonResult;

/**
 * 会员管理service
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     * @param telephone
     * @return
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
