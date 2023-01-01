package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class D_LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String ID = "timo";
	private static final String PW = "1234";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public D_LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>doGET()으로 만든 페이지</TITLE></HEAD>");
		out.println("<BODY><H1>와!</H1></BODY>");
		out.println("</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		String msg = "";

		if (id.equals(ID)) {
			msg = "비밀번호를 확인해주세요...";
			if (pw.equals(PW)) {
				msg = "티모님, 안녕하세요! :D";
			}
		} else {
			msg = "없는 아이디입니다. 확인 후 다시 시도해보세요!";
		}

		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>로그인 결과 페이지</TITLE></HEAD>");
		out.println("<BODY><H1>" + msg + "</H1></BODY>");
		out.println("</HTML>");

	}

}