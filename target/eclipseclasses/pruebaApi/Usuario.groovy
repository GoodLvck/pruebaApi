package pruebaApi

import grails.rest.*

@Resource(uri="/usuarios",readOnly = false, formats = ["json", "xml"])
class Usuario {

    String nombre
    String apellido
    String password

    // static constraints = {
    // }
}
