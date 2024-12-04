package com.xjtu.wyojcodesandbox;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WyojCodeSandboxApplicationTests {

    @Test
    void contextLoads() {
        String property = System.getProperty("user.dir");
        System.out.println("property = " + property);
    }

}
