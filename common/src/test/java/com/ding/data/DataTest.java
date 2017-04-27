package com.ding.data;

import com.ding.CustomConfig;
import com.ding.dao.UserDao;
import com.ding.main.InitToken;
import com.ding.mogondb.MongoDbService;
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
public class  DataTest {

    @Autowired
    UserDao userDao;

    @Autowired
    MongoDbService mongoDbService;

    @Autowired
    CustomConfig customConfig;

    @Autowired
    InitToken initToken;

//    @Test
//    public void testUser(){
//        for(int i = 0;i < 100; i++){
//            User user = new User();
//            user.setUserName("gurong经"+1+2*i);
//            userDao.insert(user);
//        }
//    }
//
//    @Test
//    public void testUserquery(){
//
//        User user = userDao.selectByPrimaryKey(1);
//        System.out.println(user.getUserName());
//    }

    @Test
    public void testMongo() throws Exception{
        mongoDbService.createCollection("zhihu","test1");
    }

    @Test
    public void testConfig() throws Exception{
        System.out.println(customConfig.getAgentId());
    }

    @Test
    public void testInitToken(){
        initToken.getAccessToken();
    }

}
