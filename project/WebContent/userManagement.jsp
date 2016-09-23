<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="generator" content="Xinglan Wang (bxmn4728@163.com) ">
<!--pageMeta-->

<!-- Loading Bootstrap -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">

<!-- Loading Flat UI -->
<link href="css/flat-ui.css" rel="stylesheet">

<!-- load page css -->
<link href="css/style.css" rel="stylesheet">
<link href="css/style.complete.css" rel="stylesheet">
<link href="css/myStyle.css" rel="stylesheet">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
<!--[if lt IE 9]>
			  <script src="js/html5shiv.js"></script>
			  <script src="js/respond.min.js"></script>
			<![endif]-->

<!--headerIncludes-->

<title>火星在线项目管理网</title>
</head>
<body>
	<%@include file="header.jsp"%>
	

<div id="page" class="page">

		<div class="item header margin-top-0 padding-bottom-0" id="header3">

			<header class="wrapper image image1">

				<div class="bg bg1"></div>

				<div class="container">

					<div class="row banner2">

						<div class="col-md-8 col-md-offset-2 text-center">
							<img src="images/hexagon.png" alt="logo" />
							<h1>用户资料</h1>

					
			<c:forEach var="item" items="${user}">
			<form action="User?action=edit&id=${item.userId}" method="post"  class="form-horizon">
				<div class="control-group">

					<!-- Text input-->
					<label class="control-label " for="loginName">用户名:</label>
					<div class="controls">
						 <input id="loginName"  name="loginName" value="${item.loginName}"
						type="text" /> <sup class="surely">*</sup>
					</div>
				</div>
				<div class="control-group">

					<!-- Text input-->
					<label class="control-label" for="input01">密码:</label>
					<div class="controls">
						<input type="text" id="password"  value="${item.password}"
						name="password" /> <sup class="surely">*</sup>
					</div>
				</div>

				<div class="control-group">

					<!-- Text input-->
					<label class="control-label" for="input01">邮箱：</label>
					<div class="controls">
						<input type="email" id="email" name="email"  value="${item.email}"/>
					<sup class="surely">*</sup>
					
					</div>
				</div>


	          <div class="controls">
				
					<input type="submit" value="保存修改" name="btnSubmit" style="margin:20px"/>
				
				</div>
			
				<!-- .submit -->

			</form>
			</c:forEach>	

					</div>

				</div>
				<!-- /.container -->

			</header>
		</div>


		
		</div>
	</div>
	
	<%@include file="footer.jsp"%>
	<!-- HEADER TOP -->
	<!-- Load JS here for greater good =============================-->
	<script src="js/jquery-1.8.3.min.js"></script>
	<script src="js/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="js/jquery.ui.touch-punch.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap-select.js"></script>
	<script src="js/bootstrap-switch.js"></script>
	<script src="js/flatui-checkbox.js"></script>
	<script src="js/flatui-radio.js"></script>
	<script src="js/jquery.tagsinput.js"></script>
	<script src="js/jquery.placeholder.js"></script>
	<script src="js/jquery.nivo.slider.pack.js"></script>
	<script src="js/application.js"></script>
	<script src="js/over.js"></script>
	<script>
		$(function() {

			if ($('#nivoSlider').size() > 0) {

				$('#nivoSlider').nivoSlider({
					effect : 'random',
					pauseTime : 5000
				});

			}

		})

	</script>
</body>
</html>