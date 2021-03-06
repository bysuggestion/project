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
					<h3>您的项目编号为${workId }</h3>
					<div class="col-md-6">
					<table class="table">
						<caption>资源情况</caption>
						<tr>
							
							<th>资源名称</th>
							<th>资源单价</th>
							<th>初始数量</th>
							<th>剩余数量</th>
							
							
				
						
						</tr>
						<c:forEach var="item" items="${resource}">
							<tr >

								<td >${item.resourceName}</td>
								<td >${item.costR}</td>
								<td>${item.resourceNo}</td>
								<td>${item.resourceRemain}</td>
					

								
							</tr>
						</c:forEach>
					</table>
				</div>
								<div class="col-md-6">
					<table class="table">
						<caption>组织情况</caption>
						<tr>
							
							<th>组织名称</th>
							<th>人员数量</th>
							<th>组织级别</th>
							<th>组织成本</th>
							
							
				
						
						</tr>
						<c:forEach var="item" items="${department}">
							<tr >

								<td >${item.departmentName}</td>
								<td >${item.peopleNo}</td>
								<td>${item.level}</td>
								<td>${item.costD}</td>
					

								
							</tr>
						</c:forEach>
					</table>
				</div>
		
				<div class="col-md-12 text-center" style="float:left;margin-top:20px">
				
							<form action="Work?action=finish" method="post">
						<input type="submit" class="btn btn-primary  btn-wide"
							value="结束项目" />
							 <input type="hidden"
								id="workId" name="workId" value="${workId }">
					</form>
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