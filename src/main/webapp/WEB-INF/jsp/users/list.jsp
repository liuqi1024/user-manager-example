<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/include.jsp" %>

<c:forEach items="${users }" var="user">
<div>
${user.name }
</div>
</c:forEach>