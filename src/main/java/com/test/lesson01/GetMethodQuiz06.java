package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz06")
public class GetMethodQuiz06 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/json");
		response.setCharacterEncoding("utf-8");
		
		int A = Integer.parseInt(request.getParameter("number1"));
		int B = Integer.parseInt(request.getParameter("number2"));
		
		PrintWriter out = response.getWriter();
		out.println("{\"addtion\": " + (A + B) 
				+ ", \"subtarction\": " + (A - B)
				+ ", \"multiplication\": " + (A * B)
				+ ", \"division\": " + (A / B) + "}");
		
	}
}