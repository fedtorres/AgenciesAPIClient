package agenciesapiclient

class AgencyController {

    def agencyService

    def index() {

    }

    def getAgencies() {

        if(params.siteId.length() != 3) {
            def invalidParam = "SiteId inválido"
            [result: invalidParam]
        } else if(params.paymentMethodId == "" ) {
            def invalidParam = "PaymentMethodId inválido"
            [result: invalidParam]
        } else if(!params.latitude.isDouble()) {
            def invalidParam = "Latitud inválida"
            [result: invalidParam]
        } else if(!params.longitude.isDouble()) {
            def invalidParam = "Longitud inválida"
            [result: invalidParam]
        } else if(!params.radius.isInteger()) {
            def invalidParam = "Radio inválido"
            [result: invalidParam]
        }
        else {
            def urlString = ("http://localhost:4567/agencias?siteId=" + params.siteId + "&paymentMethodId=" + params.paymentMethodId + "&nearTo=" + params.latitude + "," + params.longitude + "," + params.radius)
            if(params.limit.isInteger()) {
                urlString += "&limit=" + params.limit
            }
            if(params.offset.isInteger()) {
                urlString += "&offset=" + params.offset
            }
            urlString += "&sortingCriterion=" + params.sortingCriterion
            def result = agencyService.getAgencies(urlString)
            /*def url = new URL(urlString)
            def connection = (HttpURLConnection) url.openConnection()
            connection.setRequestMethod("GET")
            connection.setRequestProperty("Accept", "application/json")
            connection.setRequestProperty("User-Agent", "Mozilla/5.0")
            JsonSlurper json = new JsonSlurper()
            def result = json.parse(connection.getInputStream())
            def resultList = result.data*/
            [agencies: result]
        }
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

    def getLikedAgencies() {

        def likedAgenciesResult = agencyService.getLikedAgencies()
        [result: likedAgenciesResult]
    }
}
