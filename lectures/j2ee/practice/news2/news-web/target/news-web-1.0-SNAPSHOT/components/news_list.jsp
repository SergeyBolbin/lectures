<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:if test="${empty requestScope.newsList}">
    <h3>There are no news items</h3>
</c:if>

<table>
  <c:forEach var="newsItem" items="${requestScope.newsList}">

      <tr>
        <td class="news_header"><b>${newsItem.title}</b></td>
        <td class="news_header">
            <fmt:formatDate value="${newsItem.date}" pattern="dd.MM.yyyy hh:mm:ss"/>
        </td>
      </tr>

      <tr>
          <td colspan="2" class="news_content">
              ${newsItem.shortText}<br>
              <a href="${pageContext.request.contextPath}/?news=${newsItem.id}">Read more >></a>
          </td>
      </tr>
  </c:forEach>
</table>
