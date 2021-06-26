package com.mall.user.controller;

import com.mall.user.common.api.CommonResult;
import com.mall.user.service.UmsMemberService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/ums")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;

    @ApiOperation("获取验证码")
    @GetMapping(value = "/getAuthCode")
    public CommonResult getAuthCode(@RequestParam String telephone){
        return umsMemberService.generateAuthCode(telephone);
    }

    @ApiOperation("判断验证码是否正确")
    @GetMapping(value = "/verifyAuthCode")
    public CommonResult updatePassword(@RequestParam String telephone,
                                       @RequestParam String authCode){
        return umsMemberService.verifyAuthCode(telephone,authCode);
    }
}
