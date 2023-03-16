package edu.lzu.spring;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2 {
    private Logger logger = LoggerFactory.getLogger(Log4j2.class);

    @Test
    public void testLogger(){


        logger.info("############ 执行调用成功了。。。");
    }
}
