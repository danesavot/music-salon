<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="role" value=""/>
<security:authorize access="isAuthenticated()">
	<security:authentication var="role" property="principal.authorities[0]" />
</security:authorize>
<c:choose>
  <c:when test="${role == 'ROLE_USER'}">
	<li><a href="<spring:url value="/welcome"/>"><spring:message code="header.home" /></a></li>
	<li><a href="<spring:url value="/music"/>"><spring:message code="header.music" /></a></li>
	<li><a href="<spring:url value="/favorite"/>"><spring:message code="header.favorite" /></a></li>
	<li><a href="<spring:url value="/albums"/>"><spring:message code="header.album" /></a></li>
	<li><a href="<spring:url value="/categories"/>"><spring:message code="header.category" /></a></li>
	<li><a href="<spring:url value="/doLogout"/>"><spring:message code="header.logout" /></a></li>
  </c:when>
  <c:when test="${role == 'ROLE_ADMIN'}">
	<li><a href="<spring:url value="/welcome"/>"><spring:message code="header.home" /></a></li>
	<li><a href="<spring:url value="/music"/>"><spring:message code="header.music" /></a></li>
	<li><a href="<spring:url value="/favorite"/>"><spring:message code="header.favorite" /></a></li>
	<li><a href="<spring:url value="/albums"/>"><spring:message code="header.album" /></a></li>
	<li><a href="<spring:url value="/categories"/>"><spring:message code="header.category" /></a></li>

	<li class="dropdown">
    	<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Admin <span class="caret"></span></a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="<spring:url value="/albums/new"/>"><spring:message code="header.admin.newAlbum" /></a></li>
          <li><a href="<spring:url value="/categories/new"/>"><spring:message code="header.admin.newCategory" /></a></li>
          <li><a href="<spring:url value="/music/new"/>"><spring:message code="header.admin.newMusic" /></a></li>
        </ul>
    </li>		
	<li><a href="<spring:url value="/doLogout"/>"><spring:message code="header.logout" /></a></li>
  </c:when>
  <c:otherwise>
	<li><a href="<spring:url value="/welcome"/>"><spring:message code="header.home" /></a></li>
	<li><a href="<spring:url value="/albums"/>"><spring:message code="header.album" /></a></li>
	<li><a href="<spring:url value="/categories"/>"><spring:message code="header.category" /></a></li>
	<li><a href="<spring:url value="/signup"/>"><spring:message code="header.signup" /></a></li>
	<li><a href="<spring:url value="/login"/>"><spring:message code="header.login" /></a></li>
  </c:otherwise>
</c:choose>


