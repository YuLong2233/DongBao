package com.Yulong.dongbao.ums.service.impl;

import com.Yulong.dongbao.ums.entity.UmsMember;
import com.Yulong.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.Yulong.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.Yulong.dongbao.ums.mappers.UmsMemberMapper;
import com.Yulong.dongbao.ums.service.UmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author YuLong
 * @since 2021-10-22
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper,UmsMember> implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public String register(UmsMemberRegisterParamDTO umsMemberRegisterParamDTO){
        UmsMember umsMember =new UmsMember();
        //BeanUtils.copyProperties(源，目标) 此方法用于接收前端对象，并且将前端对象拷贝到对应的实体类；
        BeanUtils.copyProperties(umsMemberRegisterParamDTO,umsMember);
        String encode = passwordEncoder.encode(umsMember.getPassword());
        umsMember.setPassword(encode);
        umsMemberMapper.insert(umsMember);
        return "register success";
    }

    @Override
    public String login(UmsMemberLoginParamDTO umsMemberLoginParamDTO){

        UmsMember umsMember=umsMemberMapper.selectByName(umsMemberLoginParamDTO.getUsername());
        if(null != umsMember){
            String passwordDb = umsMember.getPassword();
            if(!passwordEncoder.matches(umsMemberLoginParamDTO.getPassword(),passwordDb)){
//                return ResultWrapper.getFailBuilder().code(StateCodeEnum.PASSWORD_ERROR.getCode()).msg(StateCodeEnum.PASSWORD_ERROR.getMsg()).build();
                return "密码不正确";
            }
        }
        System.out.println("登录成功");
        return "token";
    }

}
