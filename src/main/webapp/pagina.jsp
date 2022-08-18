<%--
  Created by IntelliJ IDEA.
  User: giolianobertoni
  Date: 16/08/22
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>teste</title>
</head>
<body>
<%--COMENTÁRIO--%>
<% String str = "Primeira página JSP"; %>
<%
    out.println(str);
%>
<div>
  <%= new SimpleDateFormat("dd/MM/yyyy").format(new Date())%>

</div>

</body>
</html>
