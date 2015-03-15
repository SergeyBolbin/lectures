<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:forEach var="topic" items="${requestScope.topics}">
  <a href="${pageContext.request.contextPath}/?topic=${topic.id}">${topic.name}</a><br>
</c:forEach>