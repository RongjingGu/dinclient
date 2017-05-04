package com.ding.data.core;

/**
 * Created by Gurongjing on 2017/4/27.
 */
public class BioDepartment {

    /*{
        "id": 2,
            "name": "钉钉事业部",
            "parentid": 1,
            "createDeptGroup": true,
            "autoAddUser": true
    }*/

    private Integer id;
    private String name;
    private Integer parentid;
    private Boolean createDeptGroup;
    private Boolean autoAddUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Boolean getCreateDeptGroup() {
        return createDeptGroup;
    }

    public void setCreateDeptGroup(Boolean createDeptGroup) {
        this.createDeptGroup = createDeptGroup;
    }

    public Boolean getAutoAddUser() {
        return autoAddUser;
    }

    public void setAutoAddUser(Boolean autoAddUser) {
        this.autoAddUser = autoAddUser;
    }
}
