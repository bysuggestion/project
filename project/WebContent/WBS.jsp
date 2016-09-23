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
					<table class="table">
						<caption>任务</caption>
						<tr>
							<th>任务编号</th>
							<th>任务级别</th>
							<th>任务名称</th>

							<th>任务开始时间</th>
							<th>任务结束时间</th>
							<th>前继任务编号</th>
							

							<th>操作</th>
						</tr>
						<c:forEach var="item" items="${task}">
							<tr >

								<td >${item.taskId}</td>
								<td >${item.level}</td>
								<td >${item.taskName}</td>
								<td>${item.taskBeginTime}</td>
								<td>${item.taskFinalTime}</td>
								<td>${item.beforeId}</td>

								<td>
									<form action="Task?action=delete" method="post">
										<input type="submit" value="删除" /> <input type="hidden"
											name="taskId" value="${item.taskId}" /> <input type="hidden"
											id="workId" name="workId" value="${workId }">
									</form>
								</td>
							</tr>
						</c:forEach>
					</table>
				</div>

				<form action="Task?action=add" method="post" class="form-inline">
					<div class="col-md-12">
						<div class="controls col-md-2">
							<label class="control-label ">任务名称:</label>
							<input id="taskName"
								name="taskName" type="text"  />
						</div>

						<!-- Text input-->

						<div class="controls  col-md-2">
							<label class="control-label ">前置任务:</label>
							<input id="beforeId"
								name="beforeId" type="number" />
						</div>
						<div class="controls  col-md-2" >
							<label class="control-label ">开始时间:</label><input
								id="taskBeginTime" name="taskBeginTime" type="Date" />
						</div>
						<div class="controls  col-md-2" >
							<label class="control-label ">完成时间:</label><input
								id="taskFinalTime" name="taskFinalTime" type="Date" />
						</div>
							<div class="controls  col-md-2" >
									<label class="control-label ">任务级别:</label><input
										id="level" name="level" type="number" min="1" max="5" step="1"
										/>
								</div>
					</div>
					<div class="col-md-6 text-center">
						<div class="col-xs-2"></div>
						<div class="col-xs-4">
							<input type="submit" value="增加任务" class="btn btn-primary"
								style="margin-top: 35px"> <input type="hidden"
								id="workId" name="workId" value="${workId }">
						</div>
					</div>
				</form>
				<div class="col-md-6 text-center" style="float:left;margin-top:20px">
						<div class="col-xs-2"></div>
						<div class="col-xs-4">
							<form action="Task?action=Gantt" method="post">
						<input type="submit" class="btn btn-primary  btn-wide btn-wider"
							value="完成创建,查看甘特图" />
							 <input type="hidden"
								id="workId" name="workId" value="${workId }">
					</form>
						</div>
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