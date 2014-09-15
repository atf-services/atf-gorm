package atf.gorm

import atf.api.Person
import grails.persistence.*
import groovy.transform.ToString

@ToString
@Entity
class GroovyPerson implements Person {
    static constraints = {
        firstName blank:false
        lastName blank:false
    }

    String firstName
    String lastName

}