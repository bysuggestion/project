package dao.use;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bean.resourceBean;
import bean.userBean;
import dao.common.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.common.DbHelper;
import dao.common.IConnectionProvider;
import dao.common.JdbcProvider;


public class ResourceDao {

	private DbHelper ct;
	public ResourceDao() throws SQLException{ 
		ct = new DbHelper();
	}

	public void insert(resourceBean item) throws SQLException{
		
		ct.insertAndReturnKey(
				"INSERT INTO resource(resourceName, resourceNo, costR,workId,resourceRemain) VALUES(?,?,?,?,?)",
				item.getResourceName(),
				item.getResourceNo(),
			
				item.getCostR(),	item.getWorkId(),
				item.getResourceRemain());
	}

	public void delete(resourceBean item) throws SQLException{
			String sql = "DELETE FROM resource WHERE resourceId=?";
			ct.updatePrepareSQL(sql, item.getResourceId());
		}



	
	public  List<resourceBean> query(int workId) throws Exception {
		String sql = "SELECT * FROM resource WHERE workId=?";
		ResultSet rs = ct.query(sql,workId);
		List<resourceBean> items = new ArrayList<resourceBean>();
		while (rs.next()){
			resourceBean item = new resourceBean();
			item.setResourceId(rs.getInt(1));
			item.setResourceName(rs.getString(3));
			item.setResourceNo(rs.getInt(4));
			item.setWorkId(rs.getInt(2));
			item.setCostR(rs.getInt(5));
			item.setResourceRemain(rs.getInt(6));
			items.add(item);
		}
		
		return items;
		
	}

	public resourceBean findById(int id) throws SQLException {
		String sql = "SELECT * FROM resource WHERE resourceId=?";
		return ct.get(resourceBean.class, sql, DbHelper.parseSmap(resourceBean.class, "resourceId","workId","resourceName", "resourceNo","costR", "resourceRemain"), id);
	}

	public void updateNo(resourceBean itemR) throws SQLException {
		String sql = "UPDATE resource SET resourceRemain=? WHERE resourceId=?";
		ct.updatePrepareSQL(sql, itemR.getResourceRemain(),itemR.getResourceId());
		
	}
}

