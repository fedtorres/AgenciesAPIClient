<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <style>
    .agencies {
        background-color: lightgray;
        color: black;
        margin: 20px;
        padding: 20px;
    }
    </style>
    <title>Agencias recomendadas</title>
</head>

<body>
    <h1>Agencias recomendadas</h1>
    <g:each var="agency" in="${result}">
        <div class="agencies">
            <p>Dirección: ${agency.addressLine}</p>
            <p>Ciudad: ${agency.city}</p>
            <p>Ubicación: ${agency.location}</p>
            <p>Código de agencia: ${agency.agencyCode}</p>
            <p>Distancia: ${agency.distance}</p>
            <p>Descripción: ${agency.description}</p>
        </div>
    </g:each>
</body>
</html>