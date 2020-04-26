package com.lixin.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

/**
 * @author zhenglubo
 */
@Data
@ToString
@EqualsAndHashCode
public class UserAddDto {


    @ApiModelProperty(value = "用户名")
    @NotBlank
    private String username;

    @ApiModelProperty(value = "密码")
    @NotBlank
    private String password;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "电话")
    @NotBlank
    private String phone;

    @ApiModelProperty(value = "是否有效 1：有效 ，0：无效")
    private Boolean isValid = true;
}
