package com.sy.watersupplysystem;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        String str  = "1666.png";
        int indexOf = str.indexOf(".");
        String substring = str.substring(indexOf);
        System.out.println(substring);
    }

}
