package controler;

import java.awt.print.Printable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.*;

/**
 * Servlet implementation class User
 */
@WebServlet("/Department")
public class Department extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Department() {
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
				String departmentName = request.getParameter("departmentName");
				int level=Integer.parseInt(request.getParameter("level"));
				int costD=Integer.parseInt(request.getParameter("costD"));
				int peopleNo = Integer.parseInt(request.getParameter("peopleNo"));
				if (departmentName != null && peopleNo != 0&&costD !=0&&level!=0){
					int workId = Integer.parseInt(request.getParameter("workId"));
					bean.departmentBean item =  new bean.departmentBean();
					item.setDepartmentName(departmentName);
					item.setPeopleNo(peopleNo);
					item.setCostD(costD);
					item.setWorkId(workId);
					item.setLevel(level);
					new DepartmentService().add(item);
					
					
					request.getRequestDispatcher("Department?action=list").forward(request, response);
				
				}
				
					
					}
				
			
			if (action.equals("list")){
				int workId = Integer.parseInt(request.getParameter("workId"));
			
				request.setAttribute("department", this.list(workId));
				request.setAttribute("is3",1);
				request.getRequestDispatcher("newProduct.jsp").forward(request, response);
			}
	if (action.equals("delete")){
				int departmentId=Integer.parseInt(request.getParameter("departmentId"));
				int workId = Integer.parseInt(request.getParameter("workId"));
				if (departmentId!=0){
					bean.departmentBean item =  new bean.departmentBean();
					item.setDepartmentId(departmentId);
					request.setAttribute("workId", workId);
					new DepartmentService().delete(item);
					request.getRequestDispatcher("Department?action=list").forward(request, response);
				}
			}
			if (action.equals("WBS")){
				int workId = Integer.parseInt(request.getParameter("workId"));
				request.setAttribute("workId", workId);
				request.getSession().setAttribute("is3",0);
				request.getRequestDispatcher("WBS.jsp").forward(request, response);
			}
			
			if (action.equals("backCreate")){
				request.getSession().setAttribute("workId",0);
				request.getSession().setAttribute("is3",0);
				request.getRequestDispatcher("workSpace.jsp").forward(request, response);
			}
			
			
		}
	}
	

	

	private List<bean.departmentBean> list(int workId) {
		return new bll.DepartmentService().find(workId);
	}
}



