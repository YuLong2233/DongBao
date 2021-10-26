package com.Yulong.dongbao.portal.web.controller;

import com.Yulong.dongbao.ums.entity.UmsMember;
import com.Yulong.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.Yulong.dongbao.ums.service.UmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: YuLong
 * @Date: 2021/10/26
 * @Description: com.Yulong.dongbao.portal.web
 */
@RestController
@RequestMapping("/ums-member")
public class UserMemberController {

    @Resource
    UmsMemberService umsMemberService;


    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/testRegister")
    public String register(@RequestBody UmsMemberRegisterParamDTO umsMemberRegisterParamDTO){

        umsMemberService.register(umsMemberRegisterParamDTO);
        return "register success";
    }



}
