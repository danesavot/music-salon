<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title><tiles:insertAttribute name="title" /></title>

<spring:url value="/resources/css/style.css" var="mainCss" />
<spring:url value="/resources/css/bootstrap.css" var="bootstrap" />
<link href="${mainCss}" rel="stylesheet" />
<link href="${bootstrap}" rel="stylesheet" />

</head>

<body>

	<div class="container">
		<nav id="menu" class="navbar navbar-default">
			<div class="container-fluid navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
					<a class="navbar-brand" href="#">Music Salon</a>
				<%-- <img src='<spring:url value="/resources/images/crema-logo.gif"/>'
					height="80px" /> --%>
			</div>

			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav navbar-right">
					<tiles:insertAttribute name="homeNavigation" />
				</ul>


			</div>
		</nav>

		<div>
			<tiles:insertAttribute name="body" />
		</div>

		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>

	</div>
</body>
</html>
