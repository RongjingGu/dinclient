package com.ding.data;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Gurongjing on 2017/4/28.
 */
public class TimerTest {

    public static void main(String[] args) throws IOException {
        Timer timer = new Timer();
        timer.schedule(new myTask(),5000,3*1000);
        while(true){
            int in = System.in.read();
            if(in == 's'){
                timer.cancel();
                break;
            }
        }
    }

    static class myTask extends TimerTask{

        @Override
        public void run() {
            System.out.println("+=======+===="+"nihao");
        }
    }
}
