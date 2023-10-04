<%--
  Created by IntelliJ IDEA.
  User: ClaudioCristianLopez
  Date: 9/28/2023
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Archivo JSP</title>
</head>
<body>

    <h1> Archivo Inicio JSP Al fin llegamos1!!!</h1>

    <form:form action="${pageContext.request.contextPath}/logout" method="post">

        <input type="submit" value="Salida"/>

    </form:form>

</body>
</html>
