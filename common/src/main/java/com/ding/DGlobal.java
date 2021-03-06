package com.ding;

/**
 * Created by Gurongjing on 2017/4/27.
 * Huifang Company
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

    /*https://oapi.dingtalk.com/user/simplelist?access_token=ACCESS_TOKEN&department_id=1*/
    public static final String GET_DEPARTMENT_USERS = "https://oapi.dingtalk.com/user/simplelist";

    /*https://oapi.dingtalk.com/user/get?access_token=ACCESS_TOKEN&userid=zhangsan*/

    public static final String GET_USER_BYUSERID = "https://oapi.dingtalk.com/user/get";

    /*https://oapi.dingtalk.com/user/list?access_token=ACCESS_TOKEN&department_id=1*/
    public static final String GET_DEPARTMENT_USERS_DETAIL = "https://oapi.dingtalk.com/user/list";

    /*https://oapi.dingtalk.com/user/getuserinfo?access_token=ACCESS_TOKEN&code=CODE*/
    public static final String GET_USERINFO_BY_CODE = "https://oapi.dingtalk.com/user/getuserinfo";

    /*https://oapi.dingtalk.com/message/send?access_token=ACCESS_TOKEN*/
    public static final String MSG_SEND = "https://oapi.dingtalk.com/message/send";

}
