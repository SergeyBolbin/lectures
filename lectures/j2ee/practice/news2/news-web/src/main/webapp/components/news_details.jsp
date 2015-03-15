<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<table>
  <c:set var="newsItem" value="${requestScope.news}"/>

    <tr>
      <td class="news_header"><b>${newsItem.title}</b></td>
      <td class="news_header">
        <fmt:formatDate value="${newsItem.date}" pattern="dd.MM.yyyy hh:mm:ss"/>
      </td>
    </tr>

    <tr>
      <td colspan="2" class="news_content">
          ${newsItem.fullText}<br>
        <a href="${pageContext.request.contextPath}/?topic=${newsItem.topic.id}"><< Back</a>
      </td>
    </tr>
</table>
