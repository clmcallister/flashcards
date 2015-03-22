<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Coding Flashcards</title>

<link href="css/bootstrap.css" rel="stylesheet" />
<link href="css/bootstrap-theme.css" rel="stylesheet" />
<link href="css/main.css" rel="stylesheet" />
</head>
<body>

	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#"> </a>
			</div>
			<ul class="nav nav-pills">
				<li role="presentation"><a href="${pageContext.request.contextPath}/home.action">Home</a></li>
				<li role="presentation"><a href="#">About</a></li>
			</ul>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
		
			<div class="col-xs-2">
				<ul class="nav nav-pills nav-stacked">
					<s:iterator value="%{#session.topicsList}" status="topic">
						<li role="presentation">
							<a href="${pageContext.request.contextPath}/flashcards.action?topicId=<s:property value="id"/>">
								<s:property value="name"/>
							</a>
						</li>
					</s:iterator>
				</ul>
			</div>
			
			<div class="col-xs-10">
				<tiles:insertAttribute name="body" />
			</div>
		</div>
	</div>

	<script src="js/jquery-1.11.2.js" type="text/javascript"></script>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/main.js" type="text/javascript"></script>
</body>
</html>