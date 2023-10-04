<%--
  Created by IntelliJ IDEA.
  User: ClaudioCristianLopez
  Date: 10/3/2023
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3 style="text-align:center">Pagina de Login</h3>

    <form:form action="${pageContext.request.contextPath}/autenticacionUsuario" method="post">

        <!-- Aca vamos a poner el tema de que pasa si ponemos mal user/pass-->

        <c:if test="${param.error!=null}"> <!-- aca si ha error, o sea.. algo != null -->
            <div style="text-align: center">
                <strong>Error: User or password not valid!!</strong>
            </div>

        </c:if>

        <div style="text-align: center">
            <p>
                UserName:<input type="text" name="username"/> <!-- aca debe llamarse username, si tiene 1 letra distinta, no funca-->
            </p>

            <p>
                Password:<input type="password" name="password"/>
            </p>

            <input type="submit" value="login">

        </div>

    </form:form>

</body>
</html>
