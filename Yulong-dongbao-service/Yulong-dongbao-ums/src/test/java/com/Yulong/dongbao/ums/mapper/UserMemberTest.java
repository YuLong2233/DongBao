package com.Yulong.dongbao.ums.mapper;

import com.Yulong.dongbao.ums.YulongdongbaoApplication;
import com.Yulong.dongbao.ums.entity.UmsMember;
import com.Yulong.dongbao.ums.service.UmsMemberService;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Auther: YuLong
 * @Date: 2021/10/22
 * @Description: com.yulong.dongbaoums.mapper
 */

@SpringBootTest(classes = YulongdongbaoApplication.class)

public class UserMemberTest {


    @Resource
    private UmsMemberService umsMemberService;
    @Test
    public void testInsert() {
        System.out.println("123");

        UmsMember t = new UmsMember();
        t.setIcon("61");
        t.setUsername("张三");
        t.setPassword("123456");
        t.setStatus(0);
        t.setNote("note");
        t.setEmail("email");
        t.setNickName("nick");

        umsMemberService.save( t);
    }
}
