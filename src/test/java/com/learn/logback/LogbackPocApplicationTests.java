package com.learn.logback;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LogbackPocApplicationTests {

    @Test
    void contextLoads() {


    }

    @Test
    public void testPerformTask() throws Exception {
        HelloController helloController=new HelloController();
        helloController.hello();
    }

}
