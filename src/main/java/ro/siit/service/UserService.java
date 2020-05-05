package ro.siit.service;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import ro.siit.servlet.UserServlet;


public class UserService {


        public static String getAge() {
            LocalDate birthday = new LocalDate(1994, 11, 01);
            LocalDate now = new LocalDate(2020, 11, 01);
            Days age = Days.daysBetween(birthday, now);

            return "age: " + age.getDays();
        }

}
