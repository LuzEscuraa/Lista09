package web;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/getresultado")
public class getresultado extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try{
		   Cookie cookies[] = null;
		   cookies = request.getCookies();
			
		   PrintWriter writer = response.getWriter();
		   writer.append( " <HTML>  <BODY> " );
		   writer.append( " <H1> Recuperando Cookie </H1> " );			
		   if (cookies != null) {
			Cookie cookie = null;
			for (int i=0; i< cookies.length; i++) {
				cookie = cookies[i];
				writer.append("Nome: " + cookie.getName() + ",  Valor: " + cookie.getValue() + "<br>"  );
			}
		   }
		   writer.append( "</BODY> </HTML> " );
		} catch (IOException e){
		   e.printStackTrace();
		}
	}

}
