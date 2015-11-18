<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Music Salon</title>
</head>
<body>

<div class="container">
    <div class="row">
		<div>
    		<div> 
			  	<div>
			  	
			  	All Albumb

<%-- 			    	<form action="<spring:url value="/albums"></spring:url>" method="post">
                    <fieldset  style="width:350px; margin: auto">
					  	<c:if test="${not empty error}">
							<div class="alert alert-danger">
								<spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br />
							</div>
						</c:if>                    
                    	<legend><spring:message code="newAlbum.legend"/></legend>
			    	  	<p>
			    		    <input placeholder="Name" class ="form-control" name='name' type="text">
			    		</p>
			    		<p>
			    			<input placeholder="Publisher" class ="form-control" name='publisher'  type="text" value="">
			    		</p>
			    		
			    		<p>
			    			<input placeholder="Date" class ="form-control" name='date'  type="date" value="">
			    		</p>
			    		
			    		<input class="btn btn-primary btn-block btn-flat" type="submit" value='<spring:message code="newAblum.create"/>'>
			    	</fieldset>
			      	</form> --%>
			    </div>
			</div>
		</div>
	</div>
</div>

</body>
</html>