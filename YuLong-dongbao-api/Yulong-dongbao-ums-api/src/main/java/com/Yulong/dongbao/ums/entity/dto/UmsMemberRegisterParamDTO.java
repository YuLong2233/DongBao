package com.Yulong.dongbao.ums.entity.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @Auther: YuLong
 * @Date: 2021/10/26
 * @Description: com.Yulong.dongbao.ums.entity.dto
 */
@Data
@ToString
public class UmsMemberRegisterParamDTO {
    private String username;
    private String password;
    private String icon;
    private String email;
    private String nickName;
    private String note;


}
