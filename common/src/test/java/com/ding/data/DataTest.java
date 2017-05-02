package com.ding.data;

import com.ding.CustomConfig;
import com.ding.DGlobal;
import com.ding.main.InitToken;
import com.ding.mogondb.MongoDbService;
import com.sweetw.idata.commons.annotations.AppUsingIdAndPwdAndIp;
import com.sweetw.idata.commons.utils.TaskTimerUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Gurongjing on 2017/4/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:*Context.xml")
public class  DataTest {

   /* @Autowired
    UserDao userDao;*/

    @Autowired
    MongoDbService mongoDbService;

    @Autowired
    CustomConfig customConfig;

    @Autowired
    InitToken initToken;

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
        initToken.initTokenTask();
    }

    @Test
    public void testToken(){
        System.out.println(DGlobal.jsTicket);
    }

    @Test
    public void testTaskTimer(){
        Timer timer = new Timer();
        timer.schedule(new myTask(),1000,1*1000);
    }

    class myTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("=========="+"你好");
        }
    }
}
