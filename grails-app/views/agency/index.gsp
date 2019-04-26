<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <g:form controller="agency" action="consultar">
            <label>SiteId: </label>
            <g:textField name="siteId"/><br/>
            <label>PaymentMethodId: </label>
            <g:textField name="paymentMethodId"/><br/>
            <label>NearTo: </label>
            <g:textField name="nearTo"/><br/>
            <g:actionSubmit value="Consultar agencias"/>
        </g:form>
</html>