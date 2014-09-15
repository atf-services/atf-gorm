package atf.gorm

import atf.api.Person
import atf.api.PersonService
import org.springframework.stereotype.Service

@Service(value = "personService")
class GroovyPersonService implements PersonService {
    @Override
    Person create(Map<String, Object> stringObjectMap) {
        return new GroovyPerson(stringObjectMap)
    }

    @Override
    Person save(Person person) {
        return person.save()
    }

    @Override
    Person get(Long id) {
        return GroovyPerson.get(id)
    }

    @Override
    void delete(Person person) {
        person.delete()
    }

    @Override
    Person findByFirstName(String s) {
        return null
    }
}
