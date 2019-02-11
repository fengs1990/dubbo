package com.fengs.dubbo.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/***
 * dubbo生产者
 * 解析xml配置文件，
 */
public class ProducerRun {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("produce-dubbo.xml");
        System.out.println(context.getDisplayName()+": here ");
        //In the case of a container, this will propagate the start signal to all components that apply.
        context.start();
        System.out.println("服务已启动............");
        //利用read方法使程序一直处于阻塞状态，方便客户端调用，否则执行完毕后，程序将自动释放所有资源。
        System.in.read();
    }
}
