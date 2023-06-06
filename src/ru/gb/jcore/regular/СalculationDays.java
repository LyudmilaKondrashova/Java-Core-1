package ru.gb.jcore.regular;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class СalculationDays {

    public static long calc() {
        int[] arr = ViewUser.birthday();
        LocalDate date = LocalDate.of(LocalDate.now().getYear(),
                LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
        LocalDate birthday = LocalDate.of(arr[0], arr[1], arr[2]);
        long resultDays = ChronoUnit.DAYS.between(birthday, date);
        return resultDays;
    }

}
