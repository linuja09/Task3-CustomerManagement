package rest

import grails.rest.Resource

@Resource(uri='/api/customers', formats=['json', 'xml'])
class Customer {
    String name

    //To implement one to many mapping (1 Customer can have N phone numbers)
    static hasMany = [contacts: Contact]

    static constraints = {
        name blank:false
    }
}
