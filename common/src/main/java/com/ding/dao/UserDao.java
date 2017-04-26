package com.ding.dao;

import com.ding.data.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by Gurongjing on 2017/4/26.
 */

@Repository
public interface UserDao {

    void insert(User user);

    User selectByPrimaryKey(Integer userId);

}
