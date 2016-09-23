package bll;


import dao.use.ResourceDao;
import dao.use.UserDao;

import java.util.List;

import bean.*;

public class UserService {
	public userBean login(String loginName, String pwd){
		try {
			return new UserDao().query(loginName, pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public void register(userBean item) {
		try {
			  new UserDao().insert(item);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void edit(userBean item) {
		try {
			  new UserDao().update(item);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void delete(userBean item) {
		try {
			  new UserDao().delete(item);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public List<userBean> find(){
		try {
			return new UserDao().query();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public userBean findById(int id) {
		try {
			return new UserDao().findById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();return null;
		}
	}


}
