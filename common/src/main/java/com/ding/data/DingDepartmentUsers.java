package com.ding.data;

import com.ding.data.core.BioUser;

import java.util.List;

/**
 * Created by Gurongjing on 2017/4/27.
 *
 */
public class DingDepartmentUsers extends DingResponseCode{

   /* {
        "userlist": [
        {
            "name": "亮",
                "userid": "056666632920142"
        },
        {
            "name": "张炸",
                "userid": "0962201147783768"
        }
    ],
        "errmsg": "ok",
            "errcode": 0
    }*/
    private List<BioUser> userlist;
    private Boolean hasMore;

    public List<BioUser> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<BioUser> userlist) {
        this.userlist = userlist;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }
}
