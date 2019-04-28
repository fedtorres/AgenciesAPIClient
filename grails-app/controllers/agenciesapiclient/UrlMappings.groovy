package agenciesapiclient

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:'/agency/index')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
