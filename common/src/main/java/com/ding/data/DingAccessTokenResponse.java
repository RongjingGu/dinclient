package com.ding.data;

/**
 * Created by Gurongjing on 2017/4/27.
 *
 */
public class DingAccessTokenResponse extends DingResponseCode {
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
