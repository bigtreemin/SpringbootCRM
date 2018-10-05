package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(value=1)
public class Application1 implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(Application1.class);

    @Override
    public void run(String... arg0) throws Exception {
     logger.info("服务启动完成1111!");
     System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作111111111111<<<<<<<<<<<<<");
     System.out.println(">>>>>>>>>>>>>>>111111111111111111111111111111<<<<<<<<<<<<<");
    }

}
