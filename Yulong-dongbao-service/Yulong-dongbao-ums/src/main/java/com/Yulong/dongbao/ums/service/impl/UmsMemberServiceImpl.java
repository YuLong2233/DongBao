package com.Yulong.dongbao.ums.service.impl;

import com.Yulong.dongbao.ums.entity.UmsMember;
import com.Yulong.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.Yulong.dongbao.ums.mappers.UmsMemberMapper;
import com.Yulong.dongbao.ums.service.UmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
        BeanUtils.copyProperties(umsMemberRegisterParamDTO,umsMember);


        String encode = passwordEncoder.encode(umsMember.getPassword());
        umsMember.setPassword(encode);
        umsMemberMapper.insert(umsMember);
        return "register success";
    }

}
