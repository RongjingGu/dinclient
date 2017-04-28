package com.ding.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ding.AuthHelper;
import com.ding.CustomConfig;
import com.ding.DGlobal;
import com.ding.data.*;
import com.sweetw.idata.commons.utils.RemoteService;
import com.sweetw.idata.commons.utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by Gurongjing on 2017/4/27.
 * huifang company
 */

@Service
public class UserService {

    private final static Logger _logger = Logger.getLogger(UserService.class.getName());

    @Autowired
    CustomConfig config;

    public DingDepartmentList getDepartmentList(Integer parentId) throws Exception {

        StringBuffer out = new StringBuffer();
        String postString = "?" + "access_token=" + DGlobal.accessToken + "&id=" + parentId;
        _logger.info("url:" + DGlobal.GET_DEPARTMENT_URL + postString);
        RemoteService.getResponse(DGlobal.GET_DEPARTMENT_URL, "", postString, "GET", "application/X-WWW-form-urlencoded", out);
        _logger.info("getResponse=" + out);
        DingDepartmentList response = Utility.JsonDeserialize(DingDepartmentList.class, out);

        return response;
    }


    public DingDepartment getDepartmentDetail(Integer depId) throws Exception {
        StringBuffer out = new StringBuffer();
        String postString = "?" + "access_token=" + DGlobal.accessToken + "&id=" + depId;
        _logger.info("url:" + DGlobal.GET_DEPARTMENT_DETAIL_URL + postString);
        RemoteService.getResponse(DGlobal.GET_DEPARTMENT_DETAIL_URL, "", postString, "GET", "application/X-WWW-form-urlencoded", out);
        _logger.info("getResponse=" + out);
        DingDepartment response = Utility.JsonDeserialize(DingDepartment.class, out);
        return response;
    }

    public DingDepartmentUsers getDingDepartmentUser(Integer depId) throws Exception {
        StringBuffer out = new StringBuffer();
        String postString = "?" + "access_token=" + DGlobal.accessToken + "&department_id=" + depId;
        _logger.info("url:" + DGlobal.GET_DEPARTMENT_USERS + postString);
        RemoteService.getResponse(DGlobal.GET_DEPARTMENT_USERS, "", postString, "GET", "application/X-WWW-form-urlencoded", out);
        _logger.info("getResponse=" + out);
        DingDepartmentUsers response = Utility.JsonDeserialize(DingDepartmentUsers.class, out);
        return response;
    }

    public DingDepartmentUserDetail getDingDepartmentUserDetail(Integer depId) throws Exception {
        StringBuffer out = new StringBuffer();
        String postString = "?" + "access_token=" + DGlobal.accessToken + "&department_id=" + depId;
        _logger.info("url:" + DGlobal.GET_DEPARTMENT_USERS_DETAIL + postString);
        RemoteService.getResponse(DGlobal.GET_DEPARTMENT_USERS_DETAIL, "", postString, "GET", "application/X-WWW-form-urlencoded", out);
        _logger.info("getResponse=" + out);
//        DingDepartmentUserDetail response = Utility.JsonDeserialize(DingDepartmentUserDetail.class, out);
        DingDepartmentUserDetail response = JSON.parseObject(out.toString(),DingDepartmentUserDetail.class);
        return response;
    }

    public String getUserId(String unionId) throws Exception {
        StringBuffer out = new StringBuffer();
        String postString = "?" + "access_token=" + DGlobal.accessToken + "&unionid=" + unionId;
        _logger.info("url:" + DGlobal.GET_USERID_UNIONID_URL + postString);
        RemoteService.getResponse(DGlobal.GET_USERID_UNIONID_URL, "", postString, "GET", "application/X-WWW-form-urlencoded", out);
        _logger.info("getResponse=" + out);
        return out.toString();
    }


    public DingUser getUserDetailByUserId(String userid) throws Exception {
        StringBuffer out = new StringBuffer();
        String postString = "?" + "access_token=" + DGlobal.accessToken + "&userid=" + userid;
        _logger.info("url:" + DGlobal.GET_USER_BYUSERID + postString);
        RemoteService.getResponse(DGlobal.GET_USER_BYUSERID, "", postString, "GET", "application/X-WWW-form-urlencoded", out);
        _logger.info("getResponse=" + out);
        DingUser response = JSON.parseObject(out.toString(),DingUser.class);
        return response;
    }


    /**
     * 开始免登
     *
     *
     */
    /**
     * 获取签名
     *
     * @param url 当前页面url
     * @return
     * @throws Exception
     */
    public JSONObject getSignature(String url) throws Exception{
        String nonceStr = AuthHelper.getRandomString(12);
        long timeStamp = System.currentTimeMillis();
        JSONObject map = new JSONObject();
        String signature = AuthHelper.sign(DGlobal.jsTicket, nonceStr, timeStamp, url);
        map.put("signature",signature);
        map.put("corpId",config.corpId);
        map.put("agentId",config.agentId);
        map.put("url",url);
        map.put("nonceStr",nonceStr);
        return map;
    }
}
