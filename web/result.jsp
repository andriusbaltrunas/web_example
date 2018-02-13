<%--
  Created by IntelliJ IDEA.
  User: andriusbaltrunas
  Date: 2/13/2018
  Time: 8:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
  <c:if test="${not empty vardas}">
    <div>Userio name : ${vardas}</div>
  </c:if>
  <div>Useriosurname : ${pavarde}</div>

  <c:choose>
    <c:when test="${amzius > 18}">
      <div>TU zinok esi senas ${vardas}</div>
    </c:when>
    <c:otherwise>
      Vis dar jauniklis tu ${vardas}
    </c:otherwise>
  </c:choose>

</body>
</html>
