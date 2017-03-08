package com.maxwell.learning.dao;

import com.maxwell.learning.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2017/3/6.
 */
@Repository
public interface UserDao {
    public User getUser(int userId);
}
