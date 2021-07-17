<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="WorkPackage.UserBean"%>
<!DOCTYPE HTML>

 <% UserBean currentUser = (UserBean) (session.getAttribute("currentSessionUser"));%>
<html>
<head>
<title>Post</title>
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
<script src="js/css3clock.js"></script>
<!--Easy Pie Chart-->
<!--skycons-icons-->
<script src="js/skycons.js"></script>
<!--//skycons-icons-->
</head>
<body>
 <div class="page-container">
   <!--/content-inner-->
	<div class="left-content">
	   <div class="inner-content">
		<!-- header-starts -->
			<!-- header-starts -->
			<div class="header-section">
						<!--menu-right-->
						<div class="top_menu">
							<!--/profile_details-->
								<div class="profile_details_left">
								
											
									       

						<li class="dropdown note">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-tasks"></i> <span class="badge blue1">2</span></a>
										<ul class="dropdown-menu two">
										<li>
											<div class="notification_header">
												<h3>Dashboard Status</h3>
											</div>
										</li>
									
										<li><a href="#">
											<div class="task-info">
												<span class="task-desc">Dashboard done</span><span class="percentage">90%</span>
											   <div class="clearfix"></div>
											</div>

											<div class="progress progress-striped active">
												 <div class="bar green" style="width:90%;"></div>
											</div>
										</a></li>
										
										<li><a href="#">
											<div class="task-info">
												<span class="task-desc">Issues fixed</span><span class="percentage">80%</span>
											   <div class="clearfix"></div>
											</div>
											<div class="progress progress-striped active">
												 <div class="bar  blue" style="width: 80%;"></div>
											</div>
										</a></li>
										
									</ul>
							</li>
							<div class="clearfix"></div>
								</ul>
							</div>
							<div class="clearfix"></div>
							<!--//profile_details-->
						</div>
						<!--//menu-right-->
					<div class="clearfix"></div>
				</div>
		<!-- //header-ends -->

                                               <!--outter-wp-->
							<div class="outter-wp">
									
										<!--/profile-->
										<h3 class="sub-tittle pro">Post/Comment</h3>
									       <div class="profile-widget">
                                                                                   
                                                                                      
                                                                                   
                                                                                   
													</div>
														<!--/profile-inner-->
														 <div class="profile-section-inner">
														       <div class="col-md-6 profile-info">
																	<h3 class="inner-tittle">Make a Post </h3>
																	<div class="main-grid3">
					
                                                                                                                                            
                                                                                                                                            
                                                                                                                                            
                                                                                                                                            
                                                                                                                                            
                                                                                                                                            
                                                                                                                                            <div class="p-20">
				  
                       <%
        if(request.getParameter("submit") !=null){
            
         
            String post = request.getParameter("post");
             String name = request.getParameter("name");
         
          
            
            Connection con;
            PreparedStatement pst;
            ResultSet rs;
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/workdatabase","root","");
            pst = con.prepareStatement("INSERT INTO `workdatabase`.`comment` (`post`, `name`) VALUES (?, ?);");
            
            pst.setString(1, post);
            pst.setString(2, name);
        
            
            
            
            pst.executeUpdate();
            
            %>
           <script>
               alert("Posted");
           </script>
        
            <%
        }
    
    
    %>
