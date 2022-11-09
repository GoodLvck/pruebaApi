class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/spots"(controller:"spot",action:"index",method:"GET")
        "/spots"(controller:"spot",action:"save",method:"POST")
        "/spots/$id"(controller:"spot",action:"update",method:"PUT")
        "/spots/$id"(controller:"spot",action:"patch",method:"PATCH")
        "/spots/$id"(controller:"spot",action:"delete",method:"DELETE")

        // "/usuarios"(controller:"usuarios",action:"index",method:"GET")
        // "/usuarios"(controller:"usuarios",action:"save",method:"POST")
        // "/usuarios/$id"(controller:"usuarios",action:"update",method:"PUT")
        // "/usuarios/$id"(controller:"usuarios",action:"patch",method:"PATCH")
        // "/usuarios/$id"(controller:"usuarios",action:"delete",method:"DELETE")

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
