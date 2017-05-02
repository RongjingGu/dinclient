package com.ding.controller;

import com.alibaba.fastjson.JSONObject;
import com.ding.CustomConfig;
import com.ding.Params;
import com.ding.data.core.BioText;
import com.ding.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Gurongjing on 2017/5/2.
 * Huifang Company
 */
@Controller("msgController")
@RequestMapping("/msg")
public class MsgController {

    @Autowired
    MsgService msgService;

    @Autowired
    CustomConfig config;

    /**
     * 同步发送信息
     *
     * @param msgtype 消息类型
     * @param params
     * @param content txt内容
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/syncSendCompanyMsg", method = {
            RequestMethod.GET,RequestMethod.POST},headers="Accept=application/json")
    @ResponseBody
    public JSONObject syncSendCompanyMsg(@RequestParam(value = "msgtype") String msgtype,
                                         Params params,
                                         @RequestParam(value = "content")String content) throws Exception{
        BioText bioText = new BioText();
        bioText.setContent(content);
        List<String> userids = params.getUserids();
        List<String> partyids = params.getPartyids();
        return msgService.syncSendCompanyMsg(userids,partyids,Integer.valueOf(config.getAgentId()),bioText,msgtype);
    }
}
