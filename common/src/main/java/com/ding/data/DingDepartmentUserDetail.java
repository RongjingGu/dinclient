package com.ding.data;

import com.ding.data.core.BioUser;

import java.util.List;

/**
 * Created by Gurongjing on 2017/4/27.
 *
 */
public class DingDepartmentUserDetail extends DingResponseCode{
    List<DingUser> userlist;

    public List<DingUser> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<DingUser> userlist) {
        this.userlist = userlist;
    }
}
