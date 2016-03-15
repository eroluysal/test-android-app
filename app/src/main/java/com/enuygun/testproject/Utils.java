package com.enuygun.testproject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mertsimsek on 15/03/16.
 */
public class Utils {

    public static List<Person> getPersonList() {
        List<Person> list = new ArrayList<>();

        Person person = new Person();
        person.name = "Mert";

        for (int i = 0; i < 100; i++)
            list.add(person);

        return list;
    }
}
