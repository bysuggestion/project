package dao.use;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.taskBean;
import bean.workBean;
import dao.common.*;
public class WorkDao {
	private DbHelper ct;
	public WorkDao() throws SQLException{ 
		ct = new DbHelper();
	}
	public int  insert(workBean item) throws SQLException{
		int workId;
		workId=ct.insertAndReturnKey(
				"INSERT INTO work(workName, workTime, workBeginTime,workFinalTime,userId) VALUES(?,?,?,?,?)",
				item.getworkName(),
				item.getWorkTime(),
				item.getWorkBeginTime(),
				item.getWorkFinalTime(),
				item.getUserId());
		
		return workId;
	}

	public List<workBean> query(int userId) throws Exception {
		String sql = "SELECT * FROM work WHERE userId=?";
		ResultSet rs = ct.query(sql,userId);
		List<workBean> items = new ArrayList<workBean>();
		while (rs.next()){
			workBean item = new workBean();
			item.setWorkId(rs.getInt(1));
			item.setworkName(rs.getString(2));
			item.setWorkTime(rs.getInt(3));
			item.setWorkBeginTime(rs.getDate(4));
			item.setWorkFinalTime(rs.getDate(5));
			item.setUserId(rs.getInt(6));
			
			items.add(item);
	}
		return items;
	}
}

