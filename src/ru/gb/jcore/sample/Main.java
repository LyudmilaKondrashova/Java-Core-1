package ru.gb.jcore.sample;

import ru.gb.jcore.regular.Decorator;
import ru.gb.jcore.regular.СalculationDays;

public class Main {

    public static void main(String[] args) {
        long daysCount = СalculationDays.calc();
        System.out.println(Decorator.decorate(daysCount));
    }

}