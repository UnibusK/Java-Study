package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*임포트 해주는 파일, 위에 작성하는거 대신 모든자로 가져오는 것으로 씀*/
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


/*
 * Servlet implementation class TestServlet
 */
@WebServlet("/AAA")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /** 사용 할일 없음
     * @see HttpServlet#HttpServlet()
     * 
 	
    public TestServlet() {
        super();
        // TODO Auto-generated constructor(생성자) stub : 자동완성 된 생성자
    }
    */

	/* 외울것 중요 **************!!
	 * a태그 또는 method="get"을 이용한 request의 경우 doGet()을 실행
	 * 도메인 부분으 직접 변경하거나 또는 자바스크립트 location변경을 수행하는 경우 get으로 본다.
	 * method="post"를 이용한 request의 경우 doPost()를 실행
	 * */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get방식으로 서블릿 실행");
		RequestDispatcher dis=request.getRequestDispatcher("/get.jsp");
		request.setAttribute("data", "doGet데이터");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post방식으로 서블릿 실행");
		RequestDispatcher dis=request.getRequestDispatcher("/post.jsp");
		request.setAttribute("data", "doPost 데이터 입니다.");
		dis.forward(request, response);
	}

}