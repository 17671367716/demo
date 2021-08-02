package com.example.aop;

import com.example.aop.a.Boy;
import com.example.aop.service.IBuy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class IBuyTest {

    @Autowired
    private Boy boy;

    @Test
    public void buy(){
        boy.buy(110,"123");
    }
}
