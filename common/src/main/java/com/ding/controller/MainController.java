package com.ding.controller;

import com.ding.DGlobal;
import com.ding.main.InitToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gurongjing on 2017/4/27.
 */

@Controller
@RequestMapping("/main")
public class MainController {

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
