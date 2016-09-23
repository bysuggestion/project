package bean;

import java.sql.Date;

public class taskBean {
	private Integer taskId;
	private Integer workId;
	private String taskName;
	private Integer beforeId;
	private Integer arrId;
	private Integer resourceId;
	private Integer resourceNo;
	private Integer departmentId;
	private Date taskBeginTime;
	private Date taskFinalTime;
	private String resourceName;
	private String departmentName;
	private Integer level;
	
	 public Integer getWorkId() {
			return workId;
		}
		public void setWorkId(Integer workId) {
			this.workId = workId;
		}
		 public Integer getArrId() {
				return arrId;
			}
			public void setArrId(Integer arrId) {
				this.arrId = arrId;
			}

	 public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	 public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Integer getBeforeId() {
		return beforeId;
	}
	public void setBeforeId(Integer beforeId) {
		this.beforeId = beforeId;
	}


	public Date getTaskBeginTime() {
		return taskBeginTime;
	}
	public void setTaskBeginTime(Date taskBeginTime) {
		this.taskBeginTime = taskBeginTime;
	}
	public Date getTaskFinalTime() {
		return taskFinalTime;
	}
	public void setTaskFinalTime(Date taskFinalTime) {
		this.taskFinalTime = taskFinalTime;
	}

	 public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	 public Integer getResourceId() {
		return resourceId;
	}
	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}
	public Integer getResourceNo() {
		return resourceNo;
	}
	public void setResourceNo(Integer resourceNo) {
		this.resourceNo = resourceNo;
	}
	 public String getResourceName() {
			return resourceName;
		}
		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}
		 public String getDepartmentName() {
				return departmentName;
			}
			public void setDepartmentName(String departmentName) {
				this.departmentName = departmentName;
			}
			public Integer getLevel() {
				return level;
			}
			public void setLevel(Integer level) {
				this.level = level;
			}



}
