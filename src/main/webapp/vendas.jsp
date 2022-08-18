<%--
  Created by IntelliJ IDEA.
  User: giolianobertoni
  Date: 16/08/22
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vendendo coisas</title>
</head>
<body>
<h1> Informações de venda </h1>
<form method="post" action="venda">
    Produto: <br>
    <input type="text" name="produto">
    Valor: <br>
    <input type="text" name="valor">
    Quantidade: <br>
    <input type="text" name="quantidade">
    <input type="submit" value="calcular">
</form>
</body>
</html>
