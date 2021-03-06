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
		<div class="tabbable" id="tabs">
			<ul class="nav nav-tabs" id="myTab">
				<li class="active"><a href="#panel-1" data-toggle="tab">项目基本信息</a>
				</li>
				<li><a href="#panel-2" data-toggle="tab">资源</a></li>
				<li><a href="#panel-3" data-toggle="tab">人员</a></li>

			</ul>

			<div class="tab-content">
				<div class="tab-pane active" id="panel-1">
					<form action="Work?action=create&id=${userId }"
						class="form-horizon" method="post">
						<div>

							<div class="col-md-2"></div>
							<div class="control-group col-md-4">

								<!-- Text input-->

								<div class="controls">
									<label class="control-label " for="workName">项目名称:</label><input
										id="workName" name="workName" type="text" /> <sup
										class="surely">*</sup>
								</div>
							</div>
							<div class="control-group col-me-4">

								<!-- Text input-->

								<div class="controls">
									<label class="control-label ">预计工期:</label><input id="workTime"
										name="workTime" type="number" min="1" />天<sup class="surely">*</sup>
								</div>
							</div>

						</div>
						<div style="margin-top: 30px">
							<div class="col-md-2"></div>
							<div class="control-group col-md-4">

								<!-- Text input-->

								<div class="controls">
									<label class="control-label ">开始时间:</label><input
										id="workBeginTime" name="workBeginTime" type="date" />
								</div>
							</div>
							<div class="control-group col-me-4">

								<!-- Text input-->

								<div class="controls">
									<label class="control-label " for="workName">完成时间:</label><input
										id="workFinalTime" name="workFinalTime" type="date" />
								</div>
							</div>
						</div>
						<div class="col-xs-12 text-center">
							<input value="完成创建，进入资源分配" type="submit"
								class="btn btn-primary btn-lg btn-wide" />
						</div>
					</form>
				</div>

				<div class="tab-pane " id="panel-2" style="position: center">

					<div class="container">
						<div class="row" id="row">
							<div class="col-md-12">
							<h3>您的项目编号为${workId }</h3>
								<table class="table">
									<caption>现有资源</caption>
									<tr>
										<th>资源名称</th>
										<th>数量</th>
										<th>单价</th>
										<th>操作</th>
									</tr>
									<c:forEach var="item" items="${resource}">
										<tr>

											<td>${item.resourceName}</td>
											<td>${item.resourceNo}</td>
											<td>${item.costR}</td>

											<td>
												<form action="Resource?action=delete" method="post">
													<input type="submit" value="删除" /> <input type="hidden"
														name="resourceId" value="${item.resourceId}" /> <input
														type="hidden" id="workId" name="workId" value="${workId }">
												</form>
											</td>
										</tr>
									</c:forEach>
								</table>
								<form action="Resource?action=add" method="post">

									<div class="controls col-md-3">
										<label class="control-label " for="resourceName">资源名称:</label><input
											id="resourceName" name="resourceName" type="text" />
									</div>



									<!-- Text input-->

									<div class="controls  col-md-3">
										<label class="control-label ">资源数量:</label><input
											id="resourceNo" name="resourceNo" type="number" />
									</div>
									<div class="controls  col-md-3">
										<label class="control-label ">资源单价:</label><input id="costR"
											name="costR" type="number" />
									</div>
									<div class="controls  col-md-3">
										<input type="submit" value="增加资源" class="btn btn-primary"
											style="margin-top: 35px"> <input type="hidden"
											id="workId" name="workId" value="${workId }">
									</div>


								</form>

							</div>
						</div>
					</div>
				</div>
				<div class="tab-pane " id="panel-3" style="position: center">

					<div class="container">
						<div class="row" id="row">
							<div class="col-md-12">
							<h3>您的项目编号为${workId }</h3>
								<table class="table">
									<caption>现有组织</caption>
									<tr>
										<th>组织名称</th>
										<th>人员数量</th>
										<th>组织级别</th>
										<th>人员成本</th>
										<th>操作</th>
									</tr>
									<c:forEach var="item" items="${department}">
										<tr>

											<td>${item.departmentName}</td>
											<td>${item.peopleNo}</td>
											<td>${item.level}</td>
											<td>${item.costD}</td>

											<td>
												<form action="Department?action=delete" method="post">
													<input type="submit" value="删除" /> <input type="hidden"
														name="departmentId" value="${item.departmentId}" /> <input
														type="hidden" id="workId" name="workId" value="${workId }">
												</form>
											</td>
										</tr>
									</c:forEach>
								</table>
								<form action="Department?action=add" method="post">

									<div class="controls col-md-3">
										<label class="control-label ">组织名称:</label><input
											id="departmentName" name="departmentName" type="text" />
									</div>



									<!-- Text input-->

									<div class="controls  col-md-3">
										<label class="control-label ">人员数量:</label><input
											id="peopleNo" name="peopleNo" type="number" />
									</div>
									<div class="controls  col-md-3" style="margin-top:40px">
										<label class="control-label ">组织级别:</label><input id="level"
											name="level" type="number" min="1" max="5" step="1" />
									</div>
									<div class="controls  col-md-3">
										<label class="control-label ">人员成本:</label><input id="costD"
											name="costD" type="number" />
									</div>
									<div class="controls  col-md-3">
										<input type="submit" value="增加组织" class="btn btn-primary"
											style="margin-top: 35px"> <input type="hidden"
											id="workId" name="workId" value="${workId }">
									</div>


								</form>
								<div class="col-xs-12 text-center">
								<div class="col-xs-2"></div>
								<div class="col-xs-4">
									<form action="Department?action=WBS" method="post">
										<input type="submit" class="btn btn-primary btn-lg btn-wide"
											value="完成创建,进入WBS分解" /> <input type="hidden" id="workId"
											name="workId" value="${workId }">
											
									</form>
									</div>
									<div class="col-xs-4">
									<form action="Department?action=backCreate" method="post">
									<input type="submit" class="btn btn-default btn-lg btn-wide"
											value="完成创建,返回" /> 
											</form>
											</div>
								</div>





								<!-- Text input-->

							</div>

						</div>
					</div>
				</div>




				<!-- Text input-->

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

	<script>
		$(function() {
			if ("${workId}" != 0) {
				if("${is3}"!=0){
					$('#myTab li:eq(2) a').tab('show');
				}
				else{
					$('#myTab li:eq(1) a').tab('show');
				}
			}

		});
		</script>


	

</body>
</html>