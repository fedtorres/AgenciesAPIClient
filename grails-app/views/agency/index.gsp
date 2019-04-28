<!DOCTYPE html>
<html>
    <head>
        <style>
        .agenciesForm {
            background-color: lightgray;
            color: black;
            margin: 20px;
            padding: 20px;
        }
        </style>
        <title>Index</title>
    </head>
    <body>
        <nav>
            <g:link action="getLikedAgencies" controller="agency">Ver agencias recomendadas</g:link>
        </nav>
        <br>
        <div class="agenciesForm">
            <g:form controller="agency" action="getAgencies">
                <label>SiteId: </label>
                <g:textField name="siteId"/><br/>
                <label>PaymentMethodId: </label>
                <g:textField name="paymentMethodId"/><br/>
                <label>Latitud: </label>
                <g:textField name="latitude"/><br/>
                <label>Longitud: </label>
                <g:textField name="longitude"/><br/>
                <label>Radio: </label>
                <g:textField name="radius"/><br/>
                <g:submitButton name="getAgenciesButton" value="Consultar agencias" />
            </g:form>
        </div>
    </body>
</html>
