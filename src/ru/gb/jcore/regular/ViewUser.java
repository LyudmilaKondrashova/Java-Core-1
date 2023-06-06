package ru.gb.jcore.regular;

import java.util.Scanner;

public class ViewUser {

    public static int[] birthday() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год Вашего рождения (4 цифры): ");
        int year = Integer.parseInt(scan.nextLine());
        System.out.print("Введите месяц Вашего рождения (от 1 до 12): ");
        int month = Integer.parseInt(scan.nextLine());
        System.out.print("Введите число Вашего рождения (от 1 до 31 в зависимости от месяца рождения): ");
        int day = Integer.parseInt(scan.nextLine());

        int[] birthdayArr = new int[3];
        birthdayArr[0] = year;
        birthdayArr[1] = month;
        birthdayArr[2] = day;

        return birthdayArr;
    }

}
