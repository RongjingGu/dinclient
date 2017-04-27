package com.ding.service;

import com.ding.DGlobal;
import com.ding.main.InitToken;
import org.apache.xml.security.Init;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.ServiceMode;
import java.awt.dnd.DragGestureListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gurongjing on 2017/4/27.
 */

@Service
public class MainService {

    @Autowired
    InitToken initToken;

    @RequestMapping(value = "/getInitToken", method = {
            RequestMethod.GET,RequestMethod.POST},headers="Accept=application/json")
    @ResponseBody
    public Map getInitToken(){
        Map map = new HashMap();
        initToken.getAccessToken();
        map.put("access_token", DGlobal.accessToken);
        map.put("ticket", DGlobal.jsTicket);
        return map;
    }
}
