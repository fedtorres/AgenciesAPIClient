package agenciesapiclient

import grails.validation.ValidationException
import groovy.json.JsonSlurper

import static org.springframework.http.HttpStatus.*

class AgencyController {

    def agencyService

    def index() {

    }

    def getAgencies() {

        def urlString = "http://localhost:4567/agencias?siteId=" + params.siteId + "&paymentMethodId=" + params.paymentMethodId + "&nearTo=" + params.latitude + "," + params.longitude + "," + params.radius
//        def urlString = "http://localhost:4567/agencias?siteId=MLA&paymentMethodId=rapipago&nearTo=-31.412971,-64.18758,300"
        def url = new URL(urlString)
        def connection = (HttpURLConnection) url.openConnection()
        connection.setRequestMethod("GET")
        connection.setRequestProperty("Accept", "application/json")
        connection.setRequestProperty("User-Agent", "Mozilla/5.0")
        JsonSlurper json = new JsonSlurper()
        def result = json.parse(connection.getInputStream())
        def resultList = result.data
        [agencies: resultList]
    }

    def like() {
        def a = new Agency(addressLine: params.addressLine, city: params.city,
                location: params.location, agencyCode: params.agencyCode,
                description: params.description, distance: params.distance)
        def likeResult = agencyService.save(a)
        [result: likeResult]
    }

    def dislike() {

        def dislikeResult = agencyService.delete(params.agencyCode)
        [result: dislikeResult]
    }
}
