package com.actions;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UsersService;
@Controller
public class UsersAction extends ActionSupport {
  private Users users;

public Users getUsers() {
	return users;
}

public void setUsers(Users users) {
	this.users = users;
}
private int user_qx;
public int getUser_qx() {
	return user_qx;
}

public void setUser_qx(int user_qx) {
	this.user_qx = user_qx;
}
@Autowired
  private UsersService us;

public UsersService getUs() {
	return us;
}

public void setUs(UsersService us) {
	this.us = us;
}
@Transactional
private String find(){
	List<Users> list=us.find(user_qx);
	Map request=(Map) ActionContext.getContext().get("request");
 	 request.put("list", list);
	return "find";
	
}
}
