<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
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
	<div class="page wrapper container">
		<div class="container">
			<div class="row" id="row">
				<div class="col-md-12">
				
					<table class="table">
						<caption>项目列表</caption>
						<tr>
							<th>项目编号</th>
							<th>项目名称</th>

							<th>项目工期</th>
							<th>项目开始时间</th>
							<th>项目结束时间</th>
							<th>操作</th>
						</tr>
						<c:forEach var="item" items="${work}">
							<tr >

								<td >${item.workId}</td>
								<td >${item.workName}</td>
								<td>${item.workTime}</td>
								<td>${item.workBeginTime}</td>
								<td>${item.workFinalTime}</td>
					
								<td>
									<form action="Department?action=WBS" method="post">
										<input type="submit" value="进入WBS分解" /> <input type="hidden"
											id="workId" name="workId" value="${item.workId }">
									</form>
								</td>
								
							</tr>
						</c:forEach>
					</table>
				</div>

		
		
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

</body>
</html>