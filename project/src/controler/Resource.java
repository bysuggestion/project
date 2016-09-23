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
@WebServlet("/Resource")
public class Resource extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resource() {
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
				String resourceName = request.getParameter("resourceName");

				int costR=Integer.parseInt(request.getParameter("costR"));
				int resourceNo = Integer.parseInt(request.getParameter("resourceNo"));
				
				if (resourceName != null && resourceNo != 0&&costR !=0){
					int workId = Integer.parseInt(request.getParameter("workId"));
					bean.resourceBean item =  new bean.resourceBean();
					item.setResourceName(resourceName);
					item.setResourceNo(resourceNo);
					item.setCostR(costR);
					item.setWorkId(workId);
					item.setResourceRemain(resourceNo);
					new ResourceService().add(item);
					
					
					request.getRequestDispatcher("Resource?action=list").forward(request, response);
				
				}
				
					
					}
				
			
			if (action.equals("list")){
				int workId = Integer.parseInt(request.getParameter("workId"));
			
				request.setAttribute("resource", this.list(workId));
				request.getRequestDispatcher("newProduct.jsp").forward(request, response);
			}
	if (action.equals("delete")){
				int resourceId=Integer.parseInt(request.getParameter("resourceId"));
				int workId = Integer.parseInt(request.getParameter("workId"));
				if (resourceId!=0){
					bean.resourceBean item =  new bean.resourceBean();
					item.setResourceId(resourceId);
					request.setAttribute("workId", workId);
					new ResourceService().delete(item);
					request.getRequestDispatcher("Resource?action=list").forward(request, response);
				}
			}
			
		}
	}

	

	private List<bean.resourceBean> list(int workId) {
		return new bll.ResourceService().find(workId);
	}
}



