<%--
  Created by IntelliJ IDEA.
  User: giolianobertoni
  Date: 18/08/22
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*, java.util.*" %>
<%String title = "agente";%>
<html>
<head>
    <title>Utilizando Expression Language</title>
</head>
<body>
<%
  int i = 10;
%>
<%--variavel instanciada, agora podemos fazer alguma opercao--%>
<%
  i += 1;
  out.println(i);
%>
<%--Outra forma de escrever--%>
<%--<jsp:text>--%>
<%--    <h2>testando outra forma</h2>--%>
<%--</jsp:text>--%>

<h1><%out.println(title)%></h1>
<div>
    <p>${header["user-agent"]}
</div>

</body>
</html>
