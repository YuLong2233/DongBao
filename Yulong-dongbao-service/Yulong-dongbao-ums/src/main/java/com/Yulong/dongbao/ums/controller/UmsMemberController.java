package com.Yulong.dongbao.ums.controller;


import com.Yulong.dongbao.ums.entity.UmsMember;
import com.Yulong.dongbao.ums.service.UmsMemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author YuLong
 * @since 2021-10-22
 */
@RestController
@RequestMapping("/ums-member")
public class UmsMemberController {

    @Resource
    private UmsMemberService umsMemberService;
   // private UpdateWrapper updateWrapper;

    @GetMapping("/InsertName")
    public void InsertName(){

        UmsMember umsMember = new UmsMember();
        umsMember.setUsername("王五3");
        umsMember.setPassword("1234567");
        Boolean b = umsMemberService.save(umsMember);

        if(b){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }



    }

}

