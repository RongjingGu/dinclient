package com.ding.data;

/**
 * Created by Gurongjing on 2017/4/27.
 *
 */
public class DingAccessTokenRequest {
    public String grant_type;
    public String corpid;
    public String corpsecret;

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid;
    }

    public String getCorpsecret() {
        return corpsecret;
    }

    public void setCorpsecret(String corpsecret) {
        this.corpsecret = corpsecret;
    }
}
