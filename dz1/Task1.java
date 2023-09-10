package com.dmdev.cs.dz1;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int minutes = (int) (Math.random() * 59);
        System.out.println(minutes);
        if (minutes >= 0 && minutes <= 14) {
            System.out.println("Первая четверть часа");
        } else if (minutes >= 15 && minutes <= 29) {
            System.out.println("Вторая четверть часа");
        } else if (minutes >= 30 && minutes <= 44) {
            System.out.println("Третья четверть часа");
        } else {
            System.out.println("Четвертая четверть часа");
        }
    }
}
