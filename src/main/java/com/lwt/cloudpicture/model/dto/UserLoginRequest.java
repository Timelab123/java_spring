package com.lwt.cloudpicture.model.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户请求
 */
@Data
public class UserLoginRequest implements Serializable {



    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;




}
