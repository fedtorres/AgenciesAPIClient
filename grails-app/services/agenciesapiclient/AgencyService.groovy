package agenciesapiclient

import grails.gorm.transactions.*
import groovy.json.JsonSlurper

@Transactional
class AgencyService {

    def getAgencies(urlString) {

        def url = new URL(urlString)
        def connection = (HttpURLConnection) url.openConnection()
        connection.setRequestMethod("GET")
        connection.setRequestProperty("Accept", "application/json")
        connection.setRequestProperty("User-Agent", "Mozilla/5.0")
        JsonSlurper json = new JsonSlurper()
        def result = json.parse(connection.getInputStream())
        return result.data
    }

    def save(agency) {
        if(Agency.findByAgencyCode(agency.agencyCode) != null) {
            return "La agencia ya está recomendada"
        } else {
            agency.save()
            return "Agencia recomendada"
        }

    }

    def delete(agencyCode) {
        def a = Agency.findByAgencyCode(agencyCode)
        if(a != null) {
            Agency.get(a.id).delete()
            return "La agencia ya no está recomendada"
        } else {
            return "La agencia no figura como recomendada"
        }
    }

    def getLikedAgencies() {
        return Agency.getAll()
    }
}