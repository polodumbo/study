package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 일반적인 Java의 Class 파일을 생성할 때에는 import가 필요 없음
//	POJO(Plain Old Java)
//		: Student, Book, ...

// Servlet으로 된 Class 파일을 생성할 때에는 기본적으로 import가 다수 필요함
//	POJO가 아닌 클래스
// 		Servlet, Filter, Listener

// @ : 어노테이션
// 설정에 관련된 정보들이 저장되는 코드
//	== 사용자(브라우저, Client)가 /TestServlet을 요청(호출)한다면,
//		이 Servlet을 실행시켜줘
//	== URL에 /TestServlet이 들어가면, 이 Servlet을 시행시켜줘!
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	// 쓸 일 없음
	private static final long serialVersionUID = 1L;

	// 기본생성자
	// 자동생성 되는데 굳이 작성하는 이유
	// 1. 개발자들에게 알려줄 용도
	// 2. public으로 생성
	public TestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	// GET으로 요청했을 때 수행되는 메서드
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>서블릿으로 만든 페이지</TITLE></HEAD>");
		out.println("<BODY><H1>확인</H1></BODY>");
		out.println("</HTML>");
	}

	// POST로 요청했을 때 수행되는 메서드
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("POST 요청 수행 중");
	}

}
