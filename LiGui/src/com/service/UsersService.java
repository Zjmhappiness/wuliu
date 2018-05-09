package com.service;

import java.util.List;

import com.entity.Users;

public interface UsersService {
  public List<Users> find(int user_qx);
}
