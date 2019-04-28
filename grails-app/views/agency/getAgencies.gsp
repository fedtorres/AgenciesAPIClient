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
    <title>Consultar agencias</title>
</head>

<body>
    <nav>
        <g:link action="getLikedAgencies" controller="agency">Ver agencias recomendadas</g:link>
    </nav>
    <br>
    <g:each var="agency" in="${agencies}">
        <div class="agencies">
            <p>Dirección: ${agency.address.address_line}</p>
            <p>Ciudad: ${agency.address.city}</p>
            <p>Ubicación: ${agency.address.location}</p>
            <p>Código de agencia: ${agency.agency_code}</p>
            <p>Distancia: ${agency.distance}</p>
            <p>Descripción: ${agency.description}</p>
            <g:link action="like" params="[addressLine: agency.address.address_line,
                                           city: agency.address.city,
                                           location: agency.address.location,
                                           agencyCode: agency.agency_code,
                                           distance: agency.distance,
                                           description: agency.description]">Like</g:link>
            <g:link action="dislike" params="[agencyCode: agency.agency_code]">Dislike</g:link>
        </div>
    </g:each>
</body>
</html>