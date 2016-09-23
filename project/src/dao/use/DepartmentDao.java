package dao.use;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bean.departmentBean;
import bean.resourceBean;
import bean.departmentBean;

import dao.common.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.common.DbHelper;
import dao.common.IConnectionProvider;
import dao.common.JdbcProvider;


public class DepartmentDao {

	private DbHelper ct;
	public DepartmentDao() throws SQLException{ 
		ct = new DbHelper();
	}

	public void insert(departmentBean item) throws SQLException{
		
		ct.insertAndReturnKey(
				"INSERT INTO department(departmentName, peopleNo, costD,level,workId) VALUES(?,?,?,?,?)",
				item.getDepartmentName(),
				item.getPeopleNo(),
			
				item.getCostD(),
				item.getLevel(),
				item.getWorkId());
	}

	public void delete(departmentBean item) throws SQLException{
			String sql = "DELETE FROM department WHERE departmentId=?";
			ct.updatePrepareSQL(sql, item.getDepartmentId());
		}
	public departmentBean query(String loginName, String password) throws SQLException{
		String sql = "SELECT * FROM department WHERE loginName = ? AND password = ? ";
		return ct.get(departmentBean.class, sql, DbHelper.parseSmap(departmentBean.class, "departmentId", "loginName", "password", "email"), loginName, password);
	}


	
	public  List<departmentBean> query(int workId) throws Exception {
		String sql = "SELECT * FROM department WHERE workId=?";
		ResultSet rs = ct.query(sql,workId);
		List<departmentBean> items = new ArrayList<departmentBean>();
		while (rs.next()){
			departmentBean item = new departmentBean();
			item.setDepartmentId(rs.getInt(1));
			item.setWorkId(rs.getInt(2));
			item.setDepartmentName(rs.getString(3));
			item.setPeopleNo(rs.getInt(4));
			item.setLevel(rs.getInt(5));
			item.setCostD(rs.getInt(6));
		
			items.add(item);
		}
		
		return items;
		
	}

	public departmentBean findById(int departmentId) throws SQLException {
		String sql = "SELECT * FROM department WHERE departmentId=?";
		return ct.get(departmentBean.class, sql, DbHelper.parseSmap(departmentBean.class, "departmentId","departmentName","peopleNo", "costD","level"), departmentId);
	}
}

