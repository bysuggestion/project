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
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="css/Gstyle.css" type="text/css" rel="stylesheet">
      
        <style type="text/css">
            body {
                font-family: Helvetica, Arial, sans-serif;
                font-size: 13px;
                padding: 0 0 50px 0;
            }
            h1 {
                margin: 40px 0 20px 0;
            }
            h2 {
                font-size: 1.5em;
                padding-bottom: 3px;
                border-bottom: 1px solid #DDD;
                margin-top: 50px;
                margin-bottom: 25px;
            }
            table th:first-child {
                width: 150px;
            }
            /* Bootstrap 3.x re-reset */
            .fn-gantt *,
            .fn-gantt *:after,
            .fn-gantt *:before {
              -webkit-box-sizing: content-box;
                 -moz-box-sizing: content-box;
                      box-sizing: content-box;
            }
        </style>
<!--headerIncludes-->

<title>火星在线项目管理网</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<div class="page wrapper container">
		<div class="container">
			<div class="row" id="row">
				<div class="col-md-12 ">
					<h3>您的项目编号为${workId }</h3>
					<h1 class=text-center>甘特图</h1>
					<div class="gantt"></div>

					<table class="table">
						<caption>任务列表</caption>
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
							<tr class="test">

								<td class="task-id">${item.taskId}</td>
								<td class="level">${item.level}</td>
								<td class="task-name">${item.taskName}</td>
								<td class="task-begintime">${item.taskBeginTime}</td>
								<td class="task-finaltime">${item.taskFinalTime}</td>
								<td class="before-id">${item.beforeId}</td>
								<td>
									<a href="Task?action=show&id=${item.taskId}"><button class="btn btn-primary btn-wide">进度更新</button></a>
								</td>

							</tr>
						</c:forEach>
					</table>
				</div>
				<div class="col-xs-12 text-center">
					<div class="col-xs-2"></div>
					<div class="col-xs-4">
						<form action="Task?action=arrangeList" method="post">
							<input type="submit" class="btn btn-primary btn-lg btn-wider"
								value="查看资源分配情况" /> <input type="hidden" id="workId"
								name="workId" value="${workId }">

						</form>
					</div>
					<div class="col-xs-4">
						<form action="Task?action=remain" method="post">
							<input type="submit" class="btn btn-default btn-lg btn-wider"
								value="查看库存情况" /> <input type="hidden" id="workId"
								name="workId" value="${workId }">
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
	
    <script src="js/jquery.cookie.min.js"></script>
    <script src="js/jquery.fn.gantt.js"></script>

    <script src="js/prettify.min.js"></script>

	 <script>
        $(function() {
        	
            "use strict";
            var ti = $('.task-id');
            var tn = $('.task-name');
            var tb = $('.task-begintime');
            var tf = $('.task-finaltime');
            var tl = $('.level');
           
            
            var arrId=[];
            var arrName=[];
            var arrBegin=[];
            var arrFinal=[];
            var arrLevel=[];
            for(var i=0;i<ti.size();i++){
            	arrId.push(ti.eq(i).html());
            	arrName.push(tn.eq(i).html());
            	arrBegin.push(tb.eq(i).html());
            	arrFinal.push(tf.eq(i).html());
            	if(tl.eq(i).html()=="1"){
            		arrLevel.push("ganttRed");
            	}
            		else{
            			arrLevel.push("ganttGreen");
            		}
            			
            	
            }
            	
            var sourceArr = [];
            for(var i=0;i<ti.size();i++){
			var json={};
			json.name=arrId[i];
			json.desc=arrName[i];
			json.values= [{
                from: getDateTime(arrBegin[i]),
                to: getDateTime(arrFinal[i]),
                label: "",
                customClass: arrLevel[i]
            }]
			
			sourceArr.push(json);
            	
            }
            $(".gantt").gantt({
            	source:sourceArr,
                navigate: "scroll",
                scale: "weeks",
                maxScale: "months",
                minScale: "hours",
                itemsPerPage: 10,
                useCookie: true,
                onItemClick: function(data) {
                    alert("Item clicked - show some details");
                },
                onAddClick: function(dt, rowId) {
                    alert("Empty space clicked - add an item!");
                },
                onRender: function() {
                    if (window.console && typeof console.log === "function") {
                        console.log("chart rendered");
                    }
                }
            });

            $(".gantt").popover({
                selector: ".bar",
                title: "I'm a popover",
                content: "And I'm the content of said popover.",
                trigger: "hover"
            });

            prettyPrint();

        });
     

      
      
        function getDateTime(date){
           return "/Date(" + (new Date(date)).getTime() + ")/"; 
        }
    </script>
</body>
</html>