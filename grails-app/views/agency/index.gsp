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
            <h1>Consultar agencias</h1>
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
                <label>Limit: </label>
                <g:textField name="limit"/><br/>
                <label>Offset: </label>
                <g:textField name="offset"/><br/>
                <g:select name='sortingCriterion' noSelection="${['null':'Criterio de orden']}" value = "DISTANCE" from="${["ADDRESS_LINE", "AGENCY_CODE", "DISTANCE"]}">
                </g:select><br/>
                <br>
                <g:submitButton name="getAgenciesButton" value="Consultar agencias" />
            </g:form>
        </div>
    </body>
</html>
