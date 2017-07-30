<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
	<head>
		<link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
		<link href="/css/main.css" rel="stylesheet" />
	</head>
	<body>
	
	<h1>${activity.name}</h1>
	
	<c:forEach items="${activity.segment_efforts}" var="segment">
		<p>${segment.name}</p>
	</c:forEach>
	
	</body>
</html>