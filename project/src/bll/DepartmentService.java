package bll;




import java.util.List;

import bean.*;
import controler.Department;
import dao.use.DepartmentDao;
import dao.use.ResourceDao;

public class DepartmentService {


	public void add(departmentBean item) {
		try {
			  new DepartmentDao().insert(item);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void delete(departmentBean item) {
		try {
			  new DepartmentDao().delete(item);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public  List<departmentBean> find(int workId){
		try {
			return new DepartmentDao().query(workId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public departmentBean findById(int departmentId) {
		try {
			return new DepartmentDao().findById(departmentId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();return null;
		}
	}


}
