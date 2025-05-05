package com.lwt.cloudpicture.controller;


import com.lwt.cloudpicture.common.BaseResponse;
import com.lwt.cloudpicture.common.ResultUtils;
import com.lwt.cloudpicture.exception.ErrorCode;
import com.lwt.cloudpicture.exception.ThrowUtils;
import com.lwt.cloudpicture.model.dto.UserLoginRequest;
import com.lwt.cloudpicture.model.dto.UserRegisterRequest;
import com.lwt.cloudpicture.model.entity.User;
import com.lwt.cloudpicture.model.vo.LoginUserVO;
import com.lwt.cloudpicture.service.UserService;

import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 用户注册
     *
     */
   @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
       ThrowUtils.throwIf(userRegisterRequest==null, ErrorCode.PARAMS_ERROR);
       String userAccount=userRegisterRequest.getUserAccount();
       String userPassword=userRegisterRequest.getUserPassword();
       String checkPassword=userRegisterRequest.getCheckPassword();

       long result=userService.userRegister(userAccount,userPassword,checkPassword);
       return ResultUtils.success(result);
   }

    /**
     * 用户登录
     */
    @PostMapping("/login")
    public BaseResponse<LoginUserVO> userLogin(@RequestBody UserLoginRequest userLoginRequest, HttpServletRequest request) {
        ThrowUtils.throwIf(userLoginRequest==null, ErrorCode.PARAMS_ERROR);
        String userAccount=userLoginRequest.getUserAccount();
        String userPassword=userLoginRequest.getUserPassword();
         LoginUserVO loginUserVO = userService.userLogin(userAccount,userPassword,request);
        return ResultUtils.success(loginUserVO);
    }

    /**
     * 获取当前登录用户
     */
    @GetMapping("/get/login")
    public BaseResponse<LoginUserVO> getLoginUser(HttpServletRequest request) {
        User loginUser = userService.getLoginUser(request);
        return ResultUtils.success(userService.getLoginUserVO(loginUser));

    }
}
