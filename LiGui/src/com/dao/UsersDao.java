package com.dao;

import java.util.List;

import com.entity.Users;

public interface UsersDao {
   public List<Users> find(int user_qx);
}
