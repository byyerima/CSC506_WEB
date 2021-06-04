package WorkPackage;

				
import WorkPackage.UserBean;
import WorkPackage.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {


public void doGet(HttpServletRequest request, HttpServletResponse response) 
			           throws ServletException, java.io.IOException {

try
{	

     UserBean user = new UserBean();
     user.setUserName(request.getParameter("uname"));
     user.setPassword(request.getParameter("pword"));

     user = UserDAO.login(user);
			
     if (user.isValid())
     {
	
          HttpSession session = request.getSession(true);	
          session.setAttribute("currentSessionUser",user); 
          response.sendRedirect("profile.jsp"); //logged-in page      		
     }
	
     else 
          response.sendRedirect("login.jsp"); //error page 
} 
		
		
catch (Throwable theException) 	
{
     System.out.println(theException); 
}
       }
	}

