package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=2)
public class Application2 implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(Application2.class);

    @Override
    public void run(String... arg0) throws Exception {
     logger.info("服务启动完成222222222!");
     System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作2222222222222222<<<<<<<<<<<<<");
     System.out.println(">>>>>>>>>>>>>>>22222222222222222<<<<<<<<<<<<<");
    }
}
