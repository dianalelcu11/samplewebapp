package ro.siit.service;

import org.joda.time.Days;
import org.joda.time.LocalDate;


public class UserService {


        public int getAge() {
            LocalDate birthday = new LocalDate(1994, 11, 01);
            LocalDate now = new LocalDate(2020, 11, 01);
            Days age = Days.daysBetween(birthday, now);

            return age.getDays();
        }

}
