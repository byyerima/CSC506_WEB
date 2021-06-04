

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Sign Up</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Graph CSS -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<link href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'>
<!-- lined-icons -->
<link rel="stylesheet" href="css/icon-font.min.css" type='text/css' />
<!-- //lined-icons -->
<script src="js/jquery-1.10.2.min.js"></script>
<!--clock init-->
</head> 
<body>
								<!--/login-->
								
									   <div class="error_page">
												<!--/login-top-->
												
													<div class="error-top up">
												
													    <div class="login">
														<h3 class="inner-tittle t-inner">Sign Up</h3>
																<form action="#" method="post">
																		<input type="text" name="name" class="fa fa-user" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}" >
                                                                                                                                                <input type="text" name="email" class="text" value="E-mail address" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'E-mail address';}" >
                                                                                                                                                <input type="text" name="phone" class="text" value="Phone" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Phone';}" >
                                                                                                                                                <input type="text" name="address" class="text" value="Address" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Address';}" >
                                                                                                                                                <input type="password" name="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
																		
                                                                                                                                                <div class="submit"><input type="submit" name="submit" onclick="myFunction()" value="Sign up" ></div>
																		<div class="clearfix"></div>
                                                                                                                                           
																		
																		<div class="new">
																			<p class="sign up">Do you have an account yet ? <a href="login.jsp"> Login here.</a></p>
																			<div class="clearfix"></div>
																		</div>
																	</form>
                                                                                                                
                                                                                                                                                                                                                                                       
  <%
        
 if(request.getParameter("submit") !=null){

Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/workdatabase","root","");
Statement st=con.createStatement();
  String name = request.getParameter("name");
  String email = request.getParameter("email");
  String phone = request.getParameter("phone");
  String address = request.getParameter("address");
  String pasword = request.getParameter("password");
  
String strQuery = "SELECT COUNT(*) FROM users where email='"+email+"'";
ResultSet rs = st.executeQuery(strQuery);
rs.next();
String Countrow = rs.getString(1);
if(Countrow.equals("0")){
int i=st.executeUpdate("insert into users(`name`, `email`, `phone`, `address`, `password`)values('"+name+"','"+email+"','"+phone+"','"+address+"','"+pasword+"')");
 %> 

  <script>
               alert("Successfully Registered!");
       </script>
              
<%
  }

         
else{
 %> 
    <script>
               alert("User name or Email Incorrect !");
       </script>
<%     
}
         }
%>
    
                                                                                                                
                                                                                                                
														</div>
														
													</div>
													 
												<!--//login-top-->
										   </div>
                                                                                        <br>
										  	<!--//login-->
										    <!--footer section start-->
										<div class="footer sign">
										<div class="error-btn">
															<a class="read fourth" href="index.jsp">Return to Home</a>
															</div>
										  <p>&copy 2021 All Rights Reserved | Design by <a href="#">CSC506 GROUP WORK</a></p>
										</div>
									<!--footer section end-->
								
<!--js -->
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
   <script src="js/bootstrap.min.js"></script>
</body>
</html>