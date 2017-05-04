package com.ding.data;

/**
 * Created by Gurongjing on 2017/5/2.
 */
public class DingUserCode extends DingResponseCode{

   /* {
        "errcode": 0,
            "errmsg": "ok",
            "userid": "USERID",
            "deviceId":"DEVICEID",
            "is_sys": true,
            "sys_level": 0|1|2
    }*/

   private String userid;
   private String deviceId;
   private String is_sys;
   private Integer sys_level;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getIs_sys() {
        return is_sys;
    }

    public void setIs_sys(String is_sys) {
        this.is_sys = is_sys;
    }

    public Integer getSys_level() {
        return sys_level;
    }

    public void setSys_level(Integer sys_level) {
        this.sys_level = sys_level;
    }
}
