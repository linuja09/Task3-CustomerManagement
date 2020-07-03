package customermanagement

import rest.Contact
import rest.Customer

class BootStrap {

    def init = { servletContext ->
        new Customer(name:"Jane")
                .addToContacts(new Contact(phoneNumber:525479665, isActive:"1"))
                .addToContacts(new Contact(phoneNumber:525479666, isActive:"1"))
                .save()
        new Customer(name:"Deenath")
                .addToContacts(new Contact(phoneNumber:525479667, isActive:"0"))
                .save()
        new Customer(name:"Sinthu").save()
    }
    def destroy = {
    }
}
