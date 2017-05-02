package com.ding.data;

import com.ding.data.core.BioText;

import java.util.List;

/**
 * Created by Gurongjing on 2017/5/2.
 * Huifang Company
 */
public class DingMsgTxtData {
    private String touser;
    private String toparty;
    private Integer agentid;
    private String msgtype;
    private BioText text;

    public DingMsgTxtData(){}

    public String getTouser() {
        return touser;
    }

    public void setTouser(List<String> userids) {
        if(userids == null){
            this.touser = null;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (userids.size() > 1) {
            for (int i = 0; i < userids.size(); i++) {
                if (i != userids.size() - 1){
                    sb.append(userids.get(i)).append("|");
                }else{
                    sb.append(userids.get(i));
                }
                this.touser = sb.toString();
            }
        } else {
            this.touser = userids.get(0);
        }
    }

    public String getToparty() {
        return toparty;
    }

    public void setToparty(List<String> partyIds) {
        if(partyIds == null){
            this.toparty = null;
            return;
        }

        StringBuilder sb = new StringBuilder();
        if (partyIds.size() > 1) {
            for (int i = 0; i < partyIds.size(); i++) {
                if (i != partyIds.size() - 1){
                    sb.append(partyIds.get(i)).append("|");
                }else{
                    sb.append(partyIds.get(i));
                }
                this.toparty = sb.toString();
            }
        } else {
            this.toparty = partyIds.get(0);
        }
    }

    public Integer getAgentid() {
        return agentid;
    }

    public void setAgentid(Integer agentid) {
        this.agentid = agentid;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public BioText getText() {
        return text;
    }

    public void setText(BioText text) {
        this.text = text;
    }
}
