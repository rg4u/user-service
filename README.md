This is the user service API

* GET - All Users
* GET - Users by surname
* GET - User by id

* POST - Create a new User

* This API contains in memory H2 database. Every time customer has to insert the following user data using API
* POST http://localhost:8181/users

* {"firstName":"Apple","surName":"Newton","email":"ap@nw.rg"}
* {"firstName":"Bulb","surName":"Einstein","email":"bu@ei.rg"}
* {"firstName":"Cell","surName":"Robert","email":"ce@ro.rg"}

* GET http://localhost:8181/users
    Fetch all users data
* http://localhost:8181/users/1
    Fetch user detail by ID (which is auto generated)
* http://localhost:8181/users?surname="Newton"
    Fetch users detail by query param surname.


* Start api using 
    mvn spring-boot:run
* Stop api using 
    CTRL + C
    




