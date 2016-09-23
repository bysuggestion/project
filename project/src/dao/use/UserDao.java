package dao.use;

import java.sql.SQLException;
import java.util.List;


import bean.userBean;
import dao.common.*;
public class UserDao {
	private DbHelper ct;
	public UserDao() throws SQLException{ 
		ct = new DbHelper();
	}
	public void insert(userBean item) throws SQLException{
		
		ct.insertAndReturnKey(
				"INSERT INTO User(loginName, password, email) VALUES(?,?,?)",
				item.getLoginName(),
				item.getPassword(),
				item.getEmail());
		
	} 
	public void update(userBean item) throws SQLException{
		String sql = "UPDATE User SET loginName=?, password=?, email=? WHERE userId=?";
		ct.updatePrepareSQL(sql, item.getLoginName(),item.getPassword(),item.getEmail(),item.getUserId());
	}
	public void delete(userBean item) throws SQLException{
			String sql = "DELETE FROM user WHERE userId=?";
			ct.updatePrepareSQL(sql, item.getUserId());
		}
	public userBean query(String loginName, String password) throws SQLException{
		String sql = "SELECT * FROM user WHERE loginName = ? AND password = ? ";
		return ct.get(userBean.class, sql, DbHelper.parseSmap(userBean.class, "userId", "loginName", "password", "email"), loginName, password);
	}

	public userBean findById(int id) throws SQLException {
		String sql = "SELECT * FROM user WHERE userId=?";
		return ct.get(userBean.class, sql, DbHelper.parseSmap(userBean.class, "userId", "loginName", "password", "email"), id);
		 
	}
	public List<userBean> query() throws SQLException {
		String sql = "SELECT * FROM user";
		return ct.find(sql,userBean.class,DbHelper.parseSmap(userBean.class,  "userId", "loginName", "password", "email"));
	}
}

