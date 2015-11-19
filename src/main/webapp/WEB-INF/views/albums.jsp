<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Music Salon</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<form action="<spring:url value="/albums"></spring:url>"
				method="post">
				<spring:url value="/music" var="musichListURL"></spring:url>
				<c:forEach var="album" items="${albums}">

					<div class="col-sm-3 col-xs-12">
						<img src="<c:url value="/imagealbum/${album.id}.png"></c:url>" class="img-responsive"
							alt="music theme">
						<div class="albumdetail">
							<h5>${album.name}</h5>
							<a href="${musichListURL}?album=${album.id}" class="listen" data-toggle="modal"
								><span
								class="glyphicon glyphicon-headphones"></span> Listen Song</a>
						</div>
					</div>
				</c:forEach>
			</form>
		</div>
	</div>

</body>
</html>