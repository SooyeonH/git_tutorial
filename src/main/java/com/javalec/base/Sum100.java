
package com.javalec.base;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sum100
 */
@WebServlet("/Sum100")
public class Sum100 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sum100() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int total=0;
		for(int i=1; i<=100 ; i++) {
			
			total+=i;
		}
		
		//total 값을 넣어줄 attribute
		request.setAttribute("result", total);
		
		int total2=total;
		for(int i=101; i<=200 ; i++) {
			
			total2+=i;
		}
		request.setAttribute("result2", total2);
		
		
		//request가 result, result2 동시에 가지고 가는것!!!
		RequestDispatcher rd = request.getRequestDispatcher("Sum100.jsp");
		rd.forward(request, response);  //result 라는 이름으로 sum100.jsp 에 날아감 
		
		
		
	}

}