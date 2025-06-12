package com.huigui.test;

import com.huigui.domain.Stu;
import com.huigui.mapper.StuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class TestClass {
    @Autowired
    private StuMapper stuMapper;


    @Test
    public void test01(){

        List<Stu> stus = stuMapper.selectList(null);
        for (Stu stu : stus) {
            System.out.println(stu);
        }
    }
}
