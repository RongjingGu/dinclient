package com.ding.data;

import com.ding.data.core.BioDepartment;

import java.util.List;

/**
 * Created by Gurongjing on 2017/4/27.
 */
public class DingDepartmentList extends DingResponseCode{

    private List<BioDepartment> department;

    public List<BioDepartment> getDepartment() {
        return department;
    }

    public void setDepartment(List<BioDepartment> department) {
        this.department = department;
    }
}
