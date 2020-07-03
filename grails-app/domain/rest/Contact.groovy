package rest

import grails.rest.Resource

/**
 * Class: Contact
 *
 */

@Resource(uri='/api/contacts', formats=['json', 'xml'])
class Contact {
    Integer phoneNumber
    String isActive

    //To implement one to many mapping (1 Customer can have N phone numbers)
    static belongsTo = [customer: Customer]

    static constraints = {
        phoneNumber blank:false
        isActive blank:false
    }
}
