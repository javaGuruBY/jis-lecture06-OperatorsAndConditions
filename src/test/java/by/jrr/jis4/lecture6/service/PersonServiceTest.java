package by.jrr.jis4.lecture6.service;

import by.jrr.jis4.lecture6.bean.Person;
import by.jrr.jis4.lecture6.service.PersonService;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonServiceTest {

    @Test
    public void drinkEleksir() {
        var person = new Person(75);
        PersonService.drinkEleksir(person);
        assertEquals(person.getAge(), 65);
    }
}
