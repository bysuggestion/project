package bean;

import java.sql.Date;

public class workBean {
	private Integer workId;
	private String workName;
	private Integer workTime;
	private Date workBeginTime;
	private Date workFinalTime;
	private Integer userId;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	 public Integer getWorkId() {
		return workId;
	}
	public void setWorkId(Integer workId) {
		this.workId = workId;
	}
	 public String getworkName() {
		return workName;
	}
	public void setworkName(String workName) {
		this.workName = workName;
	}
	public Integer getWorkTime() {
		return workTime;
	}
	public void setWorkTime(Integer workTime) {
		this.workTime = workTime;
	}

	public Date getWorkBeginTime() {
		return workBeginTime;
	}
	public void setWorkBeginTime(Date workBeginTime) {
		this.workBeginTime = workBeginTime;
	}
	public Date getWorkFinalTime() {
		return workFinalTime;
	}
	public void setWorkFinalTime(Date workFinalTime) {
		this.workFinalTime = workFinalTime;
	}

	


}
