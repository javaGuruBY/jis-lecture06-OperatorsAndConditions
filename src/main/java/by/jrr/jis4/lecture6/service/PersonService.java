package by.jrr.jis4.lecture6.service;

import by.jrr.jis4.lecture6.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonService {


    public static void drinkEleksir(Person person) {
        person.setAge(person.getAge() - 10);
    }
}
