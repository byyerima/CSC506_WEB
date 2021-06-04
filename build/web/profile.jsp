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
<title>Profile</title>
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
										<h3 class="sub-tittle pro">My Profile</h3>
									       <div class="profile-widget">
                                                                                   
                                                                                      
                                                                                            <center>    <span class="prfil-img"><img id="output" class="rounded-circle"> </span> </center>
                                                                                          
                                                                                    <p><input type="file" accept="image/*" name="image" id="file" onchange="loadFile(event)" style="display: none;"></p>

                                                                                    <br>
                                                                                 

                                                                                      <p><label for="file" style="cursor: pointer;">Upload Image</label></p> 


                                                                                    <script>
                                                                                        var loadFile = function(event){
                                                                                            var image = document.getElementById('output');
                                                                                            image.src = URL.createObjectURL(event.target.files[0]);

                                                                                        };


                                                                                    </script>
                                                                                   
													</div>
														<!--/profile-inner-->
														 <div class="profile-section-inner">
														       <div class="col-md-6 profile-info">
																	<h3 class="inner-tittle">Personal Information </h3>
																	<div class="main-grid3">
																     <div class="p-20">
																		
                                <form class="form-horizontal" action="#" method="post">
                      
                                                   <div class="form-group">
                                                         <label class="col-md-3 col-form-label" for="hf-email">Name</label>
                                                          <div class="col-sm-8">
                                                            <input type="text" class="form-control1" id="focusedinput" name="sname" placeholder="Surname"  value="<%= currentUser.getName()%>" >
                                                          </div>

                                                        </div>
                          
                            
                                                   <div class="form-group">
                                                         <label class="col-md-3 col-form-label" for="hf-email">Email-Address</label>
                                                          <div class="col-sm-8">
                                                            <input type="text" class="form-control1" id="focusedinput" name="sname" placeholder="Surname"  value="<%= currentUser.getUsername()%>" >
                                                          </div>

                                                        </div>
                          
                                                   <div class="form-group">
                                                         <label class="col-md-3 col-form-label" for="hf-email">Phone</label>
                                                          <div class="col-sm-8">
                                                            <input type="text" class="form-control1" id="focusedinput" name="sname" placeholder="Surname"  value="<%= currentUser.getPhone()%>" >
                                                          </div>

                                                        </div>
                          
                          
                                                      <div class="form-group">
                                                         <label class="col-md-3 col-form-label" for="hf-email">Address</label>
                                                          <div class="col-sm-8">
                                                            <input type="text" class="form-control1" id="focusedinput" name="sname" placeholder="Surname"  value="<%= currentUser.getAddress()%> " >
                                                          </div>

                                                        </div>
                          
                       
                        <div class="card-footer">
                      <button class="btn btn-sm btn-primary" type="submit" name="submit">
                      <i class="fa fa-dot-circle-o"></i> Update</button>
                    
                  </div>
                        
                    </form>
																	</div>
																 </div>
																
																			</div>
																			<!--//set-3-->



														<!--//forms-->
												</div>
											<!--//outer-wp-->
								
								</div>
							</div>
				<!--//content-inner-->
			<!--/sidebar-menu-->
				<div class="sidebar-menu">
					<header class="logo">
					 <span id="logo"> <h1>CSC506APP</h1></span>
				
					</header>
				<div style="border-top:1px solid rgba(69, 74, 84, 0.7)"></div>
			<!--/down-->
							<div class="down">

									  <a href="#"><span class=" name-caret"><%= currentUser.getName()%> </span></a>
									 <p>System Administrator</p>
									
									</div>
							   <!--//down-->
                                  <div class="menu">
									<ul id="menu" >
                   <li><a href="#"><i class=""></i> <span></span></a></li>
                      <li><a href="#"><i class=""></i> <span></span></a></li>
                        <li><a href="login.jsp"><i class="fa fa-power-off"></i> <span>Logout</span></a></li>
                 




								  </ul>
								</div>
							  </div>
							  <div class="clearfix"></div>
							</div>
							<script>
							var toggle = true;

							$(".sidebar-icon").click(function() {
							  if (toggle)
							  {
								$(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
								$("#menu span").css({"position":"absolute"});
							  }
							  else
							  {
								$(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
								setTimeout(function() {
								  $("#menu span").css({"position":"relative"});
								}, 400);
							  }

											toggle = !toggle;
										});
							</script>
<!--js -->
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>

<!-- Bootstrap Core JavaScript -->
   <script src="js/bootstrap.min.js"></script>
</body>
</html>
