package com.Yulong.dongbao.ums.service;

import com.Yulong.dongbao.ums.entity.UmsMember;
import com.Yulong.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author YuLong
 * @since 2021-10-22
 */

public interface UmsMemberService extends IService<UmsMember> {

    public String register(UmsMemberRegisterParamDTO umsMemberRegisterParamDTO);
}
