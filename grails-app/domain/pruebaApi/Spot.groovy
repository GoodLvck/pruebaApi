package pruebaApi

import grails.rest.*

@Resource(uri="/spots",readOnly = false, formats = ["json", "xml"])
class Spot {

    String nombre
    String descripcion
    Usuario creador

    // static constraints = {
    // }
}
