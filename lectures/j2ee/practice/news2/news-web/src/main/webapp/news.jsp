<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" type="text/css" href="css/main.css"/>
  <title>News List</title>
</head>
<body>
<table width="100%">
  <tr valign="top">
    <td width="150px" class="topics">
      <jsp:include page="components/topics.jsp"/>
    </td>
    <td>

      <c:if test="${! empty requestScope.error}">
        <div class="error">${requestScope.error}</div>
      </c:if>

      <c:choose>
        <c:when test="${! empty requestScope.news}">
          <jsp:include page="components/news_details.jsp"/>
        </c:when>
        <c:otherwise>
          <jsp:include page="components/news_list.jsp" />
        </c:otherwise>
      </c:choose>
    </td>
  </tr>
</table>
</body>
</html>
