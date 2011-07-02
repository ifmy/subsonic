<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="iso-8859-1" %>

<html>
<head>
    <%@ include file="head.jsp" %>
</head>
<body class="mainframe bgcolor1">

<h1><fmt:message key="share.title"/></h1>

<c:choose>
    <c:when test="${model.urlRedirectionEnabled}">
        <fmt:message key="share.warning"/>
        <p>
            <img src="<spring:theme code="shareFacebookImage"/>" alt="">&nbsp;<a
                href="http://www.facebook.com/sharer.php?u=${model.playUrl}" target="_blank"><fmt:message key="share.facebook"/></a>
        </p>

        <p>
            <img src="<spring:theme code="shareTwitterImage"/>" alt="">&nbsp;<a
                href="http://twitter.com/?status=Listening to ${model.playUrl}" target="_blank"><fmt:message key="share.twitter"/></a>
        </p>

        <p>
            <fmt:message key="share.link">
                <fmt:param>${model.playUrl}</fmt:param>
            </fmt:message>
        </p>
    </c:when>
    <c:otherwise>
        <p>
            <fmt:message key="share.disabled"/>
        </p>
    </c:otherwise>
</c:choose>

<sub:url value="main.view" var="backUrl"><sub:param name="path" value="${model.dir.path}"/></sub:url>
<div class="back"><a href="${backUrl}"><fmt:message key="common.back"/></a></div>

</body>
</html>