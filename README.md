# Task3-CustomerManagement

Following are theAPIs provided from backend that can be used to access 
and edit customer details. 

1.Get all phone numbers 
<br >
http://localhost:8080/api/contacts

##

2.Get all phone numbers of a single customer
<br >
http://localhost:8080/api/customers/<id of the customer>          
<br > 
E.g. http://localhost:8080/api/customers/1 

##

3.Activate a phone number
<br >
http://localhost:8080/api/contacts/<id of the phone number> 
<br >
E.g. http://localhost:8080/api/contacts/1          

##   

Include the update statement in the 'body'section
<br >
E.g.  {"isActive":"1"}