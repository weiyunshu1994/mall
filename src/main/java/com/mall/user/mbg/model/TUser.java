package com.mall.user.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "TUser",description = "用户信息实体类")
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "userName")
    private String userName;

    @ApiModelProperty(value = "password")
    private String password;

    @ApiModelProperty(value = "lastLoginTime")
    private Date lastLoginTime;

    @ApiModelProperty(value = "sex")
    private Byte sex;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", sex=").append(sex);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}