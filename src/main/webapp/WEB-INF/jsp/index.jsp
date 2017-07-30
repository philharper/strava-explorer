<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
	<head>
		<link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
		<link href="/css/main.css" rel="stylesheet" />
	</head>
	<body>
	
	<h1 style="margin: 40px;">Welcome ${athlete.firstname}</h1>
	<img style="float: right; margin: 40px;" src="${athlete.profile}"/>
	
	<c:forEach items="${activities}" var="activity">
		<a href="/activity/${activity.id}">${activity.name}</a><br/>
	</c:forEach>
	
	</body>
</html>