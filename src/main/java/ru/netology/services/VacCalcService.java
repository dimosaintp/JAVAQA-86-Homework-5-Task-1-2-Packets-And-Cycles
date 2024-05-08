package ru.netology.services;

public class VacCalcService {

    // income — доход, expenses — обязательные месячные расходы, threshold — минимальная сумма необходимая для отдыха.
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха.
        int money = 0; // количество денег на счету.

        for (int month = 0; month < 12; month++) {

            if (money < threshold) {
                money = money + income - expenses; // работа.
            } else {
                money = (money - expenses) / 3; // отдых.
                count++;
            }
        }
        return count;
    }
}