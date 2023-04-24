package web;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/resultado")
public class resultado extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			String infope = req.getParameter("infope");
			String infops = req.getParameter("infops");
			String infoa = req.getParameter("infoa");
			
			PrintWriter writer = resp.getWriter();
			
			Cookie infope2 = new Cookie("infope", infope );
			Cookie infops2 = new Cookie("infops", infops );	
			Cookie infoa2 = new Cookie("infoa", infoa );
				resp.addCookie(infope2);
				resp.addCookie(infops2);
				resp.addCookie(infoa2);
				writer.append( " <HTML>  <BODY> " );
				writer.append( " <H1> Lista 9 Questao1 </H1> " );
				writer.append(infoa2.getValue() + " ");
				writer.append(infops2.getValue() + " ");
				writer.append(infope2.getValue() + " ");
				writer.append( "</BODY> </HTML>  " ); 

			
		}
	}


