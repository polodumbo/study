package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/B_CalcServlet")
public class B_CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public B_CalcServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String op = request.getParameter("operator");
		// int res=calc(num1,num2,op);
		int res = new B_Calc(num1, num2, op).getRes();

		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>계산 결과 페이지</TITLE></HEAD>");
		out.println("<BODY><H1>" + num1 + " " + op + " " + num2 + " = " + res + "</H1></BODY>");
		out.println("</HTML>");
	}

	/*
	 * public int calc(int num1,int num2,String op) { int res=0; if(op.equals("+"))
	 * { res=num1+num2; } else if(op.equals("-")) { res=num1-num2; } else
	 * if(op.equals("x")) { res=num1*num2; } else { res=num1/num2; } return res; }
	 */
}
