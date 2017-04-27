package com.ding.main;

import com.ding.CustomConfig;
import com.ding.DGlobal;
import com.ding.data.DingAccessTokenRequest;
import com.ding.data.DingAccessTokenResponse;
import com.ding.data.DingJsTicketRespone;
import com.sweetw.idata.commons.utils.RemoteService;
import com.sweetw.idata.commons.utils.TaskTimerUtil;
import com.sweetw.idata.commons.utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.TimerTask;
import java.util.logging.Logger;

/**
 * Created by Gurongjing on 2017/4/27.
 */

@Component
@Scope("singleton")
public class InitToken {

    @Autowired
    CustomConfig customConfig;

    private final static Logger _logger = Logger.getLogger(InitToken.class.getName());

    public  void initTokenTask() {
        //每隔7000秒，更新一次操作码
        TaskTimerUtil.schedule(new TimerTask() {
            public void run() {
                getAccessToken();
            }
        }, 5000, 900 * 1000);
    }

    public  void getAccessToken() {
        StringBuffer out = new StringBuffer();
        DingAccessTokenRequest request = new DingAccessTokenRequest();

        _logger.info("corpId:"+customConfig.getCorpId()+"corpSecret"+customConfig.getCorpSecret());

        request.setCorpid(customConfig.getCorpId());
        request.setCorpsecret(customConfig.getCorpSecret());
        String postData = "?"+Utility.object2Form(request);

        try {
            _logger.info("url:"+ DGlobal.ACCESS_TOKEN_URL+"request"+postData);
            RemoteService.getResponse(DGlobal.ACCESS_TOKEN_URL, "", postData, "GET", "application/X-WWW-form-urlencoded", out);
            _logger.info("getResponse"+out);
            DingAccessTokenResponse response = Utility.JsonDeserialize(DingAccessTokenResponse.class,out);
            DGlobal.accessToken = response.getAccess_token();
            _logger.info("accessToken="+DGlobal.accessToken);
            StringBuffer wxOut =  new StringBuffer();
            //https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=%s&type=jsapi
            String ticketRequest="?access_token=" + DGlobal.accessToken;

            RemoteService.getResponse(DGlobal.JSTICKET_URL, "", ticketRequest,"GET", "application/X-WWW-form-urlencoded", wxOut);
            _logger.info("getResponse"+wxOut);
            DingJsTicketRespone ticketResponse = Utility.JsonDeserialize(DingJsTicketRespone.class,wxOut);

            DGlobal.jsTicket = ticketResponse.getTicket();

            _logger.info("ticket="+DGlobal.jsTicket);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
