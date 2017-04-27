package com.ding;

/**
 * Created by Gurongjing on 2017/4/27.
 */
public class DGlobal {

    public static String accessToken;

    public static String jsTicket;

    public static final String DEFAULT_TIME_ZONE = "GMT+8";

    public static final String ACCESS_TOKEN_URL = "https://oapi.dingtalk.com/gettoken";

    public static final String JSTICKET_URL = "https://oapi.dingtalk.com/get_jsapi_ticket";

    /*https://oapi.dingtalk.com/department/list?access_token=ACCESS_TOKEN&id=xx&lang=zh_CN(非必填)*/
    public static final String GET_DEPARTMENT_URL = "https://oapi.dingtalk.com/department/list";

    /*https://oapi.dingtalk.com/department/get?access_token=ACCESS_TOKEN&id=2*/
    public static final String GET_DEPARTMENT_DETAIL_URL = "https://oapi.dingtalk.com/department/get";

    /*https://oapi.dingtalk.com/user/getUseridByUnionid?access_token=ACCESS_TOKEN&unionid=xxxxxx*/
    public static final String GET_USERID_UNIONID_URL = "https://oapi.dingtalk.com/user/get";



}
