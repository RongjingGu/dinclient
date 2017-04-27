package com.ding.data;

/**
 * Created by Gurongjing on 2017/4/27.
 *
 */
public class DingDepartment extends DingResponseCode {
    /*{"deptHiding":false,
       "parentid":1,
       "outerPermitDepts":"",
       "groupContainSubDept":false,
       "deptManagerUseridList":"",
       "errcode":0,
       "id":35503146,
       "outerPermitUsers":"",
       "createDeptGroup":true,
       "order":1,
       "outerDept":false,
       "name":"dep1",
       "orgDeptOwner":"",
       "autoAddUser":true,
       "deptPerimits":"",
       "errmsg":"ok",
       "userPerimits":""}
       */

    private Integer id;
    private String name;
    private Integer order;
    private Integer parentid;
    private Boolean createDeptGroup;
    private Boolean groupContainSubDept;
    private Boolean autoAddUser;
    private Boolean deptHiding;
    private String deptPerimits;
    private String userPerimits;
    private Boolean outerDept;
    private String outerPermitDepts;
    private String outerPermitUsers;
    private String orgDeptOwner;
    private String deptManagerUseridList;

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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
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

    public Boolean getDeptHiding() {
        return deptHiding;
    }

    public void setDeptHiding(Boolean deptHiding) {
        this.deptHiding = deptHiding;
    }

    public String getDeptPerimits() {
        return deptPerimits;
    }

    public void setDeptPerimits(String deptPerimits) {
        this.deptPerimits = deptPerimits;
    }

    public String getUserPerimits() {
        return userPerimits;
    }

    public void setUserPerimits(String userPerimits) {
        this.userPerimits = userPerimits;
    }

    public Boolean getOuterDept() {
        return outerDept;
    }

    public void setOuterDept(Boolean outerDept) {
        this.outerDept = outerDept;
    }

    public String getOuterPermitDepts() {
        return outerPermitDepts;
    }

    public void setOuterPermitDepts(String outerPermitDepts) {
        this.outerPermitDepts = outerPermitDepts;
    }

    public String getOuterPermitUsers() {
        return outerPermitUsers;
    }

    public void setOuterPermitUsers(String outerPermitUsers) {
        this.outerPermitUsers = outerPermitUsers;
    }

    public String getOrgDeptOwner() {
        return orgDeptOwner;
    }

    public void setOrgDeptOwner(String orgDeptOwner) {
        this.orgDeptOwner = orgDeptOwner;
    }

    public String getDeptManagerUseridList() {
        return deptManagerUseridList;
    }

    public void setDeptManagerUseridList(String deptManagerUseridList) {
        this.deptManagerUseridList = deptManagerUseridList;
    }

    public Boolean getGroupContainSubDept() {
        return groupContainSubDept;
    }

    public void setGroupContainSubDept(Boolean groupContainSubDept) {
        this.groupContainSubDept = groupContainSubDept;
    }
}
