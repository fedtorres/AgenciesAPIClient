<%--
  Created by IntelliJ IDEA.
  User: fedetorres
  Date: 2019-04-26
  Time: 11:34
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <g:each var="agency" in="${agencies.data}">
        <p>${agency.description}</p>
        <p>${agency.address.address_line}</p>
        <p>${agency.agency_code}</p>
        <p>${agency.distance}</p>
    </g:each>
</body>
</html>