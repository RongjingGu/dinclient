package com.ding.data;

import com.ding.dao.UserDao;
import com.sweetw.idata.commons.annotations.AppUsingIdAndPwdAndIp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Gurongjing on 2017/4/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:*Context.xml")
public class DataTest {

    @Autowired
    UserDao userDao;

    @Test
    public void testUser(){
        for(int i = 0;i < 100; i++){
            User user = new User();
            user.setUserName("gurong经"+1+2*i);
            userDao.insert(user);
        }
    }

    @Test
    public void testUserquery(){

        User user = userDao.selectByPrimaryKey(1);
        System.out.println(user.getUserName());
    }

}
