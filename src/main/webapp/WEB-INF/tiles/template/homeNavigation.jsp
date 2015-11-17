<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="role" value=""/>
<security:authorize access="isAuthenticated()">
	<security:authentication var="role" property="principal.authorities[0]" />
</security:authorize>
<c:choose>
  <c:when test="${role == 'freelancer'}">
    <li><a href="<spring:url value="/welcome"/>"><spring:message code="header.home" /></a></li>
	<li><a href="<spring:url value="/addFreelancer"/>"><spring:message code="header.addprofile" /></a></li>
	<li><a href="<spring:url value="/doLogout"/>"><spring:message code="header.logout" /></a></li>
  </c:when>
  <c:when test="${role == 'customer'}">
    <li><a href="<spring:url value="/welcome"/>"><spring:message code="header.home" /></a></li>
	<li><a href="<spring:url value="/create_job"/>"><spring:message code="header.createjob" /></a></li>
	<li><a href="<spring:url value="/freelancers"/>"><spring:message code="header.freelancer" /></a></li>
	<li><a href="<spring:url value="/doLogout"/>"><spring:message code="header.logout" /></a></li>
  </c:when>
  <c:otherwise>
	<li><a href="<spring:url value="/welcome"/>"><spring:message code="header.home" /></a></li>
	<li><a href="<spring:url value="/album"/>"><spring:message code="header.album" /></a></li>
	<li><a href="<spring:url value="/category"/>"><spring:message code="header.category" /></a></li>
	<li><a href="<spring:url value="/signup"/>"><spring:message code="header.signup" /></a></li>
	<li><a href="<spring:url value="/login"/>"><spring:message code="header.login" /></a></li>
  </c:otherwise>
</c:choose>


