package ru.gb.jcore.regular;

public class Decorator {

    public static String decorate(long days){
        return String.format("С момента Вашего рождения прошло %d дней", days);
    }

}
