package agenciesapiclient

class Agency {

    String addressLine
    String city
    String location
    String agencyCode
    String description
    String distance

    static constraints = {
        addressLine nullable: false
        city nullable: false
        location nullable: false
        agencyCode nullable: false
        description nullable: false
        distance nullable: false
    }
}
