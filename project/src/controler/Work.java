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

import bean.workBean;
import bll.*;

/**
 * Servlet implementation class Work
 */
@WebServlet("/Work")
public class Work extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Work() {
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
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		String workName = request.getParameter("workName");
		

	
		
		if (action != null && !action.equals("")){
			
			if(action.equals("create")){
				Integer workTime = Integer.parseInt(request.getParameter("workTime"));
				Date  workBeginTime=Date.valueOf(request.getParameter("workBeginTime"));
				Date workFinalTime=Date.valueOf(request.getParameter("workFinalTime"));
				if (workName != null && workTime != null&&workBeginTime!=null&&workFinalTime!=null){
					Integer id = Integer.parseInt(request.getParameter("id"));
					bean.workBean item =  new bean.workBean();
					item.setworkName(workName);
					item.setWorkTime(workTime);
					item.setWorkBeginTime(workBeginTime);
					item.setUserId(id);
					item.setWorkFinalTime(workFinalTime);
					
					int workId =new workService().add(item);
				
					 request.getSession().setAttribute("workId", workId);
					 request.getRequestDispatcher("newProduct.jsp").forward(request, response);
				
				}
				else{response.getWriter().print("<script>alert(\"表单没填完!\");location.href=\"workSpace.jsp\";</script>");
					
					}
			}
			if (action.equals("finish")){
				
			
				request.getSession().setAttribute("workId", 0);
				request.getSession().setAttribute("is3", 0);
				request.getRequestDispatcher("workSpace.jsp").forward(request, response);
			}
			if (action.equals("show")){
				int id = Integer.parseInt(request.getParameter("id"));
				request.setAttribute("work", this.listW(id));
		
			
		
				request.getRequestDispatcher("workList.jsp").forward(request,response);
			}
			
		
		}
	}

	private List<bean.workBean> listW(int userId) {
		return new workService().find(userId);
	}
}



