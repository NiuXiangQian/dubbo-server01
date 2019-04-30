package com.oracle.dubbo.provider;


import com.oracle.dubbo.mapper.SysUserMapper;
import com.oracle.dubbo.service.UserDubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: 服务注册
 * @Author: admin
 * @CreateDate: 2019/4/22 11:21
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/22 11:21
 * @UpdateRemark:
 * @Version: 1.0
 **/
public class Provider {

    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring/application.xml");
        SysUserMapper bean = app.getBean(SysUserMapper.class);
        System.out.println("bean = " + bean);
        app.start();
        System.in.read();

    }
}
