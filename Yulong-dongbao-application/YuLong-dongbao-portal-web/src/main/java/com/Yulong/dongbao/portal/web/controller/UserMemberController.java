package com.Yulong.dongbao.portal.web.controller;

import com.Yulong.dongbao.ums.entity.UmsMember;
import com.Yulong.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.Yulong.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.Yulong.dongbao.ums.service.UmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    /**
    * 注册
    * @param umsMemberRegisterParamDTO
    * @return
    */
    @PostMapping("/testRegister")
    public String register(@RequestBody UmsMemberRegisterParamDTO umsMemberRegisterParamDTO){

        umsMemberService.register(umsMemberRegisterParamDTO);
        return "register success";
    }

    @PostMapping("/login")
    public String login(@RequestBody UmsMemberLoginParamDTO umsMemberLoginParamDTO){

        umsMemberService.login(umsMemberLoginParamDTO);
        return "login success";
    }

}
