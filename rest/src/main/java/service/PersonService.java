package service;

import comm.PersonRepository;

public class PersonService {
    private PersonRepository personRepository;
    public PersonService (PersonRepository personRepository) {
        personRepository = this.personRepository;
    }

}
