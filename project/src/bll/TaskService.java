package bll;


import dao.use.DepartmentDao;
import dao.use.ResourceDao;
import dao.use.TaskDao;
import dao.use.UserDao;

import java.util.List;

import bean.*;
import controler.Resource;

public class TaskService {


	public int add(taskBean item) {
		try {
			return  new TaskDao().insert(item);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	
	}
	public void addArr(taskBean item) {
		try {
			  new TaskDao().insertArr(item);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public void delete(taskBean item) {
		try {
			  new TaskDao().delete(item);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public  List<taskBean> find(int taskId){
		try {
			return new TaskDao().query(taskId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	public void updateRemain(resourceBean item) {
	
		try {
		new TaskDao().updateRemain(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	public void deleteArr(taskBean item) {
		// TODO Auto-generated method stub
		try {
			  new TaskDao().deleteArr(item);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<taskBean> findT(int workId) {
		try {
			return new TaskDao().queryT(workId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public List<taskBean> findAW(int workId) {
		try {
			return new TaskDao().queryAW(workId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void edit(taskBean item) {
		try {
			  new TaskDao().update(item);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public taskBean findOneT(int taskId) {
		try {
			return new TaskDao().queryOneT(taskId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public taskBean findById(int id) {
		try {
			return new TaskDao().findById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();return null;
		}
	}


}
