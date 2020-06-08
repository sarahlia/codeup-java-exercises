<%--
  Moved all the logic to the servlet(LoginServlet.java)
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <%-- Another way to do include. Can be with or without closing jsp tag. --%>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Please Log In"/>
    </jsp:include>
</head>

<body>
<%@include file="partials/navbar.jsp"%>

<div class="container">
    <h3>Please Log In</h3>
    <form action="/login" method="post">
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" id="username" name="username">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password">
        </div>
        <input type="submit">
    </form>
</div>
</body>

</html>