package agenciesapiclient

class Agency {

    String addressLine
    String city
    String location
    String state
    String agencyCode
    String description
    String distance
    String id

    static constraints = {
        addressLine nullable: false
        city nullable: false
        location nullable: false
        state nullable: false
        agencyCode nullable: false
        description nullable: false
        distance nullable: false
        id nullable: false
    }
}
