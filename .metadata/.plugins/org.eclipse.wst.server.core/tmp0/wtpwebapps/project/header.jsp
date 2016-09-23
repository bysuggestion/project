<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!-- SITE HEADER -->
<header id="site-header">
<div class="row">
	<nav class="navbar navbar-inverse" role="navigation">
		<div class="container-fluid navbar-collapse" >
			<div class="navbar-header">
				<a class="navbar-brand" href="index.jsp"><img src="images/hexagon.png "
					style="width: 24px"></a>
			</div>
			<div class="collapse navbar-collapse" >
				<ul class="nav navbar-nav">
					

							<li><a href="User?action=show&id=${userId}">账户管理</a></li>
							<li><a href="Work?action=show&id=${userId}">项目管理</a></li>
							<li><a href="#fakelink">解决方案</a></li>
							<li><a href="workSpace.jsp">工作平台</a></li>

				

				</ul>
			
				<form class="navbar-form pull-left" action="#" role="search">
					<div class="form-group">
						<div class="input-group">
							<input class="form-control" id="searchThing" type="search"
								placeholder="Search"> <span class="input-group-btn">
								<button type="submit" class="btn">
									<span><img src="images/searchIcon.png" style="height:21px"></span>
								</button>
							</span>
						</div>
					</div>
				</form>
			
			
		
				<ul class="nav navbar-nav navbar-right">
			

							<li><a href=#>欢迎${loginName}</a></li>
							<li><a href="User?action=logout">注销</a></li>
					
			
			</ul>
		
		</div>
		</div>
	</nav>
</div>
	<!-- HEADER TOP -->



<%/*
	
		 <div class="navbar">

				<!-- SITE LOGO -->
				<div class="logo-wrapper">
					<a herf=“index.jsp”><img src="/images/hexagon.png" ></a>
					
				</div>
				<!-- // SITE LOGO -->
				<!-- SITE NAVIGATION MENU -->
				<nav id="site-menu" role="navigation">
					<ul class="main-menu  hidden-xs">
						<c:choose>
							<c:when test="${empty loginName}">
								<li class="active"><a href="Login.jsp" onClick="login()">我的悦书</a>
								</li>
								<li><a href="Product?action=listNew">新书</a></li>
								<li><a href="Product?action=listOld">二手书</a></li>
								<li><a href="aboutUs.jsp">About Us</a></li>


								<li><a href="Login.jsp">&nbsp;&nbsp;>>>登陆</a></li>
								<li><a href="Register.jsp">注册</a></li>
							</c:when>

							<c:otherwise>
								<li class="active"><a href="User?action=show&id=${userId}">我的悦书</a>
								</li>
								<li><a href="Product?action=list">新书</a></li>
								<li><a href="Product?action=list">二手书</a></li>
								<li><a href="aboutUs.jsp">About Us</a></li>
								<li><a href=#>欢迎${loginName}</a></li>
								<li><a href="User?action=logout">&nbsp;&nbsp;注销</a></li>
							</c:otherwise>
						</c:choose>
					</ul>

				</nav>
				<!-- // SITE NAVIGATION MENU -->
				*/%>
	

	<!-- // MAIN HEADER -->
</header>
<!-- // SITE HEADER -->
