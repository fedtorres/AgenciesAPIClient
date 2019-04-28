package agenciesapiclient

import grails.gorm.transactions.*

@Transactional
class AgencyService {

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