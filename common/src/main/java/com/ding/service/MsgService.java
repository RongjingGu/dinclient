package com.ding.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ding.DGlobal;
import com.ding.data.DingMsgTxtData;
import com.ding.data.core.BioText;
import com.sweetw.idata.commons.utils.RemoteService;
import com.sweetw.idata.commons.utils.Utility;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Gurongjing on 2017/5/2.
 * Huifang Company
 */
@Service
public class MsgService {


    private static final Logger _logger = Logger.getLogger(MsgService.class.getName());

    /**
     * 同步发送企业会话
     * @return
     */
    public JSONObject syncSendCompanyMsg(List<String> userids, List<String> partyids, Integer agentid, BioText bioText,String msgType) throws Exception{
        StringBuffer out = new StringBuffer();
        DingMsgTxtData dingMsgData = new DingMsgTxtData();
        dingMsgData.setAgentid(agentid);
        dingMsgData.setMsgtype(msgType);
        dingMsgData.setText(bioText);
        dingMsgData.setTouser(userids);
        dingMsgData.setToparty(partyids);
        /*String postData = Utility.object2Form(dingMsgData);*/
        String jsonString = JSON.toJSONString(dingMsgData, true);
        _logger.info("url:" + DGlobal.MSG_SEND + jsonString);
        RemoteService.getResponse(DGlobal.MSG_SEND+"?"+"access_token=" + DGlobal.accessToken, "", jsonString, "POST", "application/X-WWW-form-urlencoded", out);
        _logger.info("getResponse=" + out);
        JSONObject myJsonObject = (JSONObject) JSONObject.parse(out.toString());
        return myJsonObject;
    }



}
