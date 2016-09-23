package dao.use;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bean.departmentBean;
import bean.resourceBean;
import bean.taskBean;
import bean.userBean;
import dao.common.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.common.DbHelper;
import dao.common.IConnectionProvider;
import dao.common.JdbcProvider;


public class TaskDao {

	private DbHelper ct;
	public TaskDao() throws SQLException{ 
		ct = new DbHelper();
	}

	public int insert(taskBean item) throws SQLException{
		int taskId;
		taskId=ct.insertAndReturnKey(
				"INSERT INTO task(taskName, beforeId, taskBeginTime,taskFinalTime,workId,level) VALUES(?,?,?,?,?,?)",
				item.getTaskName(),
				item.getBeforeId(),
				item.getTaskBeginTime(),
				item.getTaskFinalTime(),
				item.getWorkId(),
				item.getLevel());
		return taskId;	}

	public void delete(taskBean item) throws SQLException{
			String sql = "DELETE FROM task WHERE taskId=?";
			ct.updatePrepareSQL(sql, item.getTaskId());
		}


	public void insertArr(taskBean item) throws SQLException {
		ct.insertAndReturnKey(
				"INSERT INTO arrange(taskId, resourceNo, resourceId,departmentId,resourceName,departmentName,workId) VALUES(?,?,?,?,?,?,?)",
				item.getTaskId(),
				item.getResourceNo(),
			item.getResourceId(),
				item.getDepartmentId(),
				item.getResourceName(),
				item.getDepartmentName(),
				item.getWorkId());
		
	}


	public void updateRemain(resourceBean item) throws SQLException{
		String sql = "UPDATE resource SET resourceRemain=? WHERE resourceId=?";
		ct.updatePrepareSQL(sql, item.getResourceRemain(),item.getResourceId());
	}

	public List<taskBean> query(int taskId) throws Exception {
		String sql = "SELECT * FROM arrange WHERE taskId=?";
		ResultSet rs = ct.query(sql,taskId);
		List<taskBean> items = new ArrayList<taskBean>();
		while (rs.next()){
			taskBean item = new taskBean();
			item.setArrId(rs.getInt(1));
			item.setTaskId(rs.getInt(2));
			item.setResourceId(rs.getInt(3));
			item.setResourceName(rs.getString(4));
			item.setResourceNo(rs.getInt(5));
			item.setDepartmentId(rs.getInt(6));
			item.setDepartmentName(rs.getString(7));
			item.setWorkId(rs.getInt(8));
		
			items.add(item);
		}
		
		return items;
	}

	public void deleteArr(taskBean item) throws SQLException {
		String sql = "DELETE FROM arrange WHERE arrId=?";
		ct.updatePrepareSQL(sql, item.getArrId());
		
	}

	public List<taskBean> queryT(int workId) throws Exception {
		String sql = "SELECT * FROM task WHERE workId=?";
		ResultSet rs = ct.query(sql,workId);
		List<taskBean> items = new ArrayList<taskBean>();
		while (rs.next()){
			taskBean item = new taskBean();
			item.setTaskId(rs.getInt(1));
			item.setWorkId(rs.getInt(2));
		
			item.setTaskName(rs.getString(3));
			item.setBeforeId(rs.getInt(4));
			item.setTaskBeginTime(rs.getDate(5));
			item.setTaskFinalTime(rs.getDate(6));
			item.setLevel(rs.getInt(7));
			items.add(item);
		}
		
		return items;
	}

	public List<taskBean> queryAW(int workId) throws Exception {
		String sql = "SELECT * FROM arrange WHERE workId=?";
		ResultSet rs = ct.query(sql,workId);
		List<taskBean> items = new ArrayList<taskBean>();
		while (rs.next()){
			taskBean item = new taskBean();
			item.setArrId(rs.getInt(1));
			item.setTaskId(rs.getInt(2));
			item.setResourceId(rs.getInt(3));
			item.setResourceName(rs.getString(4));
			item.setResourceNo(rs.getInt(5));
			item.setDepartmentId(rs.getInt(6));
			item.setDepartmentName(rs.getString(7));
			item.setWorkId(rs.getInt(8));
			items.add(item);
	}
		return items;
	}

	public void update(taskBean item) throws SQLException {
		String sql = "UPDATE task SET taskName=?,beforeId=?,taskBeginTime=?,taskFinalTime=?,level=? WHERE taskId=?";
		ct.updatePrepareSQL(sql, item.getTaskName(),item.getBeforeId(),item.getTaskBeginTime(),item.getTaskFinalTime(),item.getLevel(),item.getTaskId());
		
	}

	public taskBean queryOneT(int taskId) throws Exception {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM task WHERE taskId=?";
		ResultSet rs = ct.query(sql,taskId);
		
			taskBean item = new taskBean();
			item.setTaskId(rs.getInt(1));
			item.setWorkId(rs.getInt(2));
		
			item.setTaskName(rs.getString(3));
			item.setBeforeId(rs.getInt(4));
			item.setTaskBeginTime(rs.getDate(5));
			item.setTaskFinalTime(rs.getDate(6));
			item.setLevel(rs.getInt(7));
		return item;
	}

	public taskBean findById(int id) throws SQLException {
		String sql = "SELECT * FROM task WHERE taskId=?";
		return ct.get(taskBean.class, sql, DbHelper.parseSmap(taskBean.class, "taskId","workId", "taskName","beforeId" ,"taskBeginTime","taskFinalTime","level"), id);
	}

	
}

