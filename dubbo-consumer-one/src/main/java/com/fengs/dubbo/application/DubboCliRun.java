package com.fengs.dubbo.application;

import com.fengs.dubbo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * dubbo客户端
 * 解析xml配置文件，得到zk中注册的服务类
 * 并执行类中方法，达到调用目的
 */
public class DubboCliRun {

    public static void main(String[] args) {
        //加载并解析配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer-dubbo.xml");
        //In the case of a container,
        //this will propagate the start signal to all components that apply.
        context.start();
        //得到zk中注册的服务类DemoService（具体实现类为produce中定义的DemoServiceImpl，具体配置见produce-dubbo.xml）
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println(demoService.getList(10L));
    }
}
