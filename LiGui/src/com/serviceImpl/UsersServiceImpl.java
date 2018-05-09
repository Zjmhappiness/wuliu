package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UsersDao;
import com.entity.Users;
import com.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
 private UsersDao dao;
 
	public UsersDao getDao() {
		return dao;
	}

	public void setDao(UsersDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Users> find(int user_qx) {
		// TODO Auto-generated method stub
		return dao.find(user_qx);
	}

}
