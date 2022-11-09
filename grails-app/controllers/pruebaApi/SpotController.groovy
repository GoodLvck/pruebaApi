package pruebaApi


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import grails.rest.*
import grails.converters.*

// @Transactional(readOnly = true)
class SpotController extends RestfulController{

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT"]
    // static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    SpotController(){
        super(Spot)
    }

    // def index(Integer max) {
    //     params.max = Math.min(max ?: 10, 100)
    //     respond Spot.list(params), [status: OK]
    // }

    // @Transactional
    // def save(Spot spotInstance) {
    //     if (spotInstance == null) {
    //         render status: NOT_FOUND
    //         return
    //     }

    //     spotInstance.validate()
    //     if (spotInstance.hasErrors()) {
    //         render status: NOT_ACCEPTABLE
    //         return
    //     }

    //     spotInstance.save flush:true
    //     respond spotInstance, [status: CREATED]
    // }

    // @Transactional
    // def update(Spot spotInstance) {
    //     if (spotInstance == null) {
    //         render status: NOT_FOUND
    //         return
    //     }

    //     spotInstance.validate()
    //     if (spotInstance.hasErrors()) {
    //         render status: NOT_ACCEPTABLE
    //         return
    //     }

    //     spotInstance.save flush:true
    //     respond spotInstance, [status: OK]
    // }

    // @Transactional
    // def delete(Spot spotInstance) {

    //     if (spotInstance == null) {
    //         render status: NOT_FOUND
    //         return
    //     }

    //     spotInstance.delete flush:true
    //     render status: NO_CONTENT
    // }
}
