package ru.netology.javaqa.javaqamvn.services;

public class RelaxOrJobService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;

        int rest = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money = money - expenses;
                money = money / 3;
                rest++;

            } else {
                money = money + income;
                money = money - expenses;
            }
        }

        return rest;


    }
}
