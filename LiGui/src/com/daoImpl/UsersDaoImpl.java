package com.daoImpl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dao.UsersDao;
import com.entity.Users;
@Repository
public class UsersDaoImpl implements UsersDao {
	@Autowired
  private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public List<Users> find(int user_qx) {
		// TODO Auto-generated method stub
		String hql=" from Users where user_qx='"+user_qx+"' ";
		/*Map map=new HashMap();
		if(user_qx!=null&&!user_qx.equals("")){
			hql+=" and user_qx=:user_qx ";
			map.put("user_qx", user_qx);
		}*/
		
		
		return hibernateTemplate.find(hql);
	}

}
