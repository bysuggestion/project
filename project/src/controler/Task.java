package controler;

import java.awt.print.Printable;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.resourceBean;
import bean.taskBean;
import bll.*;

/**
 * Servlet implementation class User
 */
@WebServlet("/Task")
public class Task extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Task() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
	
	

		if (action != null && !action.equals("")){
		
			if(action.equals("add")){
				String taskName = request.getParameter("taskName");

				int beforeId=Integer.parseInt(request.getParameter("beforeId"));
				int workId = Integer.parseInt(request.getParameter("workId"));
				int level=Integer.parseInt(request.getParameter("level"));
				Date  taskBeginTime=Date.valueOf(request.getParameter("taskBeginTime"));
				Date taskFinalTime=Date.valueOf(request.getParameter("taskFinalTime"));
				if (taskName != null && workId!= 0&&taskBeginTime !=null &&taskFinalTime!=null&&level!=0){
					bean.taskBean item =  new bean.taskBean();
			
					item.setTaskName(taskName);
				item.setBeforeId(beforeId);
					item.setTaskBeginTime(taskBeginTime);
			item.setTaskFinalTime(taskFinalTime);
					item.setWorkId(workId);
					item.setLevel(level);
					int taskId=new TaskService().add(item);
					 request.getSession().setAttribute("taskId", taskId);
					 request.getSession().setAttribute("workId", workId);
					
					request.setAttribute("resource", this.listR(workId));
					request.setAttribute("department", this.listD(workId));
				
					request.getRequestDispatcher("arrange.jsp").forward(request, response);
				
				}
				
					
					}
				
			
			if (action.equals("listTask")){
				int workId = Integer.parseInt(request.getParameter("workId"));
				 request.getSession().setAttribute("workId", workId);
				 request.setAttribute("task", this.listT(workId));
				request.getRequestDispatcher("WBS.jsp").forward(request, response);
			}
		if(action.equals("arrange")){
			int resourceNo = Integer.parseInt(request.getParameter("resourceNo"));
			int workId = Integer.parseInt(request.getParameter("workId"));
			int taskId = Integer.parseInt(request.getParameter("taskId"));
			int resourceId = Integer.parseInt(request.getParameter("resourceId"));
			int departmentId = Integer.parseInt(request.getParameter("departmentId"));
			bean.resourceBean itemR=  new ResourceService().findById(resourceId);
			int resourceRemain=itemR.getResourceRemain();
			String resourceName= itemR.getResourceName();
			bean.departmentBean itemD=  new DepartmentService().findById(departmentId);
			String departmentName=itemD.getDepartmentName();
					bean.taskBean item =  new bean.taskBean();
					item.setTaskId(taskId);
					item.setResourceId(resourceId);
					item.setResourceNo(resourceNo);
					item.setDepartmentId(departmentId);
					item.setResourceName(resourceName);
					item.setDepartmentName(departmentName);
					item.setWorkId(workId);
					new TaskService().addArr(item);
					
					itemR.setResourceRemain(resourceRemain-resourceNo);
		 new ResourceService().updateNo(itemR);
					request.getRequestDispatcher("Task?action=listArrange").forward(request, response);
				
				
			}
		if (action.equals("listArrange")){
			int taskId = Integer.parseInt(request.getParameter("taskId"));
			int workId = Integer.parseInt(request.getParameter("workId"));
			
			request.setAttribute("resource", this.listR(workId));
			request.setAttribute("department", this.listD(workId));
			request.setAttribute("arrange", this.listA(taskId));
			request.getRequestDispatcher("arrange.jsp").forward(request, response);
		}
		if (action.equals("arrangeList")){
			
			int workId = Integer.parseInt(request.getParameter("workId"));
			
			
			request.setAttribute("arrange", this.listAW(workId));
			request.getRequestDispatcher("arrangeList.jsp").forward(request, response);
		}

			if (action.equals("edit")){
				int workId = Integer.parseInt(request.getParameter("workId"));
				int taskId=Integer.parseInt(request.getParameter("taskId"));
				String taskName = request.getParameter("taskName");
				int level=Integer.parseInt(request.getParameter("level"));
				int beforeId=Integer.parseInt(request.getParameter("beforeId"));

				Date  taskBeginTime=Date.valueOf(request.getParameter("taskBeginTime"));
				Date taskFinalTime=Date.valueOf(request.getParameter("taskFinalTime"));
				if (taskName != null &&taskBeginTime !=null &&taskFinalTime!=null&&level!=0){
					bean.taskBean item =  new bean.taskBean();
					item.setTaskId(taskId);
					item.setTaskName(taskName);
					item.setBeforeId(beforeId);
					item.setTaskBeginTime(taskBeginTime);
					item.setTaskFinalTime(taskFinalTime);
					item.setLevel(level);
					new TaskService().edit(item);
					 request.getSession().setAttribute("workId", workId);
					request.getRequestDispatcher("Task?action=Gantt").forward(request, response);
				}
			}
			if (action.equals("show")){
				int id = Integer.parseInt(request.getParameter("id"));
				ArrayList<bean.taskBean> taskBean=new ArrayList<bean.taskBean>();
		
				taskBean.add(this.show(id));
				request.setAttribute("task",taskBean);
		
				request.getRequestDispatcher("editTask.jsp").forward(request,response);
			}

	if (action.equals("delete")){
				int taskId=Integer.parseInt(request.getParameter("taskId"));
				int workId = Integer.parseInt(request.getParameter("workId"));
				if (taskId!=0){
					bean.taskBean item =  new bean.taskBean();
					item.setTaskId(taskId);
					request.setAttribute("workId", workId);
					new TaskService().delete(item);
					request.getRequestDispatcher("Task?action=list").forward(request, response);
				}
				
			}
		if (action.equals("deleteArr")){
			int arrId=Integer.parseInt(request.getParameter("arrId"));
			int workId = Integer.parseInt(request.getParameter("workId"));
			if (arrId!=0){
				bean.taskBean item =  new bean.taskBean();
				item.setArrId(arrId);;
				request.setAttribute("workId", workId);
				new TaskService().deleteArr(item);
				request.getRequestDispatcher("Task?action=listArrange").forward(request, response);
			}
			
		}
		if (action.equals("Gantt")){
			
			int workId = Integer.parseInt(request.getParameter("workId"));
			 request.getSession().setAttribute("workId", workId);
			 request.setAttribute("task", this.listT(workId));
			request.getRequestDispatcher("Gantt.jsp").forward(request, response);
			}
if (action.equals("remain")){
			
			int workId = Integer.parseInt(request.getParameter("workId"));
			 request.getSession().setAttribute("workId", workId);
			 request.setAttribute("resource", this.listR(workId));
				request.setAttribute("department", this.listD(workId));
			request.getRequestDispatcher("resourceRemain.jsp").forward(request, response);
			}	
		
		
			
		}
	}
	
	
	private List<bean.taskBean> listAW(int workId) {
		return new TaskService().findAW(workId);
	}


	private bean.taskBean show(int id) {
		
		try {
			return new bll.TaskService().findById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    }
		return null;
    }
	
	

	private List<bean.resourceBean> listR(int workId) {
		return new bll.ResourceService().find(workId);
	}
	private List<bean.taskBean> listA(int taskId) {
		return new bll.TaskService().find(taskId);
	}
	private List<bean.departmentBean> listD(int workId) {
		return new bll.DepartmentService().find(workId);
	}
	private List<bean.taskBean> listT(int workId) {
		return new TaskService().findT(workId);
	}

}



