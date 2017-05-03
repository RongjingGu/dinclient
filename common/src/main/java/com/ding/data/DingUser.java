package com.ding.data;

import java.util.List;
import java.util.Map;

/**
 * Created by Gurongjing on 2017/4/27.
 *
 */
public class DingUser extends DingResponseCode {
    /* {
         "errmsg": "ok",
             "errcode": 0,
             "orderInDepts": "{35709507:69618530708041592}",
             "position": "",
             "remark": "",
             "department": [
         35709507
        ],
         "tel": "",
             "unionid": "7KD9UgVx3U80ii05L91u6ngiEiE",
             "userid": "056666632920142",
             "isSenior": false,
             "dingId": "$:LWCP_v1:$VjiXDVaaw6O1lKgaMs0FdQ==",
             "workPlace": "",
             "isBoss": false,
             "name": "亮",
             "stateCode": "86",
             "avatar": "",
             "jobnumber": "",
             "isLeaderInDepts": "{35709507:false}",
             "email": "",
             "active": true,
             "isAdmin": false,
             "isHide": false,
             "mobile": "18800587191",
             "openId": "7KD9UgVx3U80ii05L91u6ngiEiE"
     }*/
    private String orderInDepts;
    private String position;
    private String remark;
    private List<Integer> department;
    private String tel;
    private String unionid;
    private String userid;
    private Boolean isSenior;
    private String dingId;
    private String workPlace;
    private Boolean isBoss;
    private String name;
    private String stateCode;
    private String avatar;
    private String jobnumber;
    private String isLeaderInDepts;
    private String email;
    private Boolean active;
    private Boolean isAdmin;
    private Boolean isHide;
    private String mobile;
    private String openId;
    private String isLeader;

    public String getOrderInDepts() {
        return orderInDepts;
    }

    public void setOrderInDepts(String orderInDepts) {
        this.orderInDepts = orderInDepts;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<Integer> getDepartment() {
        return department;
    }

    public void setDepartment(List<Integer> department) {
        this.department = department;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Boolean getSenior() {
        return isSenior;
    }

    public void setSenior(Boolean senior) {
        isSenior = senior;
    }

    public String getDingId() {
        return dingId;
    }

    public void setDingId(String dingId) {
        this.dingId = dingId;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public Boolean getBoss() {
        return isBoss;
    }

    public void setBoss(Boolean boss) {
        isBoss = boss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber;
    }

    public String getIsLeaderInDepts() {
        return isLeaderInDepts;
    }

    public void setIsLeaderInDepts(String isLeaderInDepts) {
        this.isLeaderInDepts = isLeaderInDepts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Boolean getHide() {
        return isHide;
    }

    public void setHide(Boolean hide) {
        isHide = hide;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getIsLeader() {
        return isLeader;
    }

    public void setIsLeader(String isLeader) {
        this.isLeader = isLeader;
    }
}
