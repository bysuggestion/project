package bll;



import dao.use.TaskDao;
import dao.use.UserDao;
import dao.use.WorkDao;

import java.sql.SQLException;
import java.util.List;

import bean.*;
public class workService {



			public int add(workBean item)  {
		
					try {
						return new WorkDao().insert(item);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return 0;
					
			
				
			
			}
	

			public List<workBean> find(int userId) {
				try {
					return new WorkDao().query(userId);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
		

	}


