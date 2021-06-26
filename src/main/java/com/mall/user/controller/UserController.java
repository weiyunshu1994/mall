package com.mall.user.controller;

import com.mall.user.common.api.CommonResult;
import com.mall.user.mbg.model.TUser;
import com.mall.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户信息查询Controller
 * created by Alvin on 2021/5/29
 */
@Api(tags = "UserController")
@RestController
@RequestMapping(value = "/v1/user")
public class UserController {
//    @Value("${user_name}")
//    String name;

    @Autowired
    private UserService userService;

    @ApiOperation("获取所有行人信息")
    @GetMapping("/listAll")
    public CommonResult<List<TUser>> listAll(){
        return CommonResult.success(userService.listAllUser());
    }

    @ApiOperation("新建行人信息")
    @PostMapping("/create")
    public CommonResult createUser(@RequestBody TUser tUser){
        int count = userService.createUser(tUser);
        return CommonResult.success(tUser.getId());
    }

    @ApiModelProperty("根据行人id查询行人信息")
    @GetMapping("/infoById")
    public CommonResult<TUser> user(@RequestParam(value = "id",required = true) int id){
        TUser tUser = userService.getUser(id);
        return CommonResult.success(tUser);
    }


//    @PostMapping("/update/{id}")
//    public String updateUser(@PathVariable("id") Long id, @RequestBody TUser tUser,){
//        return null;
//    }

}
