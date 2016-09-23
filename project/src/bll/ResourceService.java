package bll;


import dao.use.ResourceDao;
import dao.use.UserDao;

import java.util.List;

import bean.*;
import controler.Resource;

public class ResourceService {
	
	public void add(resourceBean item) {
		try {
			  new ResourceDao().insert(item);
			
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
	public void delete(resourceBean item) {
		try {
			  new ResourceDao().delete(item);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public  List<resourceBean> find(int workId){
		try {
			return new ResourceDao().query(workId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public resourceBean findById(int id) {
		try {
			return new ResourceDao().findById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();return null;
		}
	}

	public void updateNo(resourceBean itemR) {
	
		try {
			  new ResourceDao().updateNo(itemR);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}


}