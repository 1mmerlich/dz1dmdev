package com.dmdev.cs.dz2;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 *
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 *
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class Task3 {
    public static void main(String[] args) {
        int initialSalary = 600;
        int expenses = 300;
        double investmentPercentage = 0.1;
        double investmentReturnRate = 0.02;
        int months = 38;

        double[] savings = calculateSavings(initialSalary, expenses, investmentPercentage, investmentReturnRate, months);

        double vanyaSavings = savings[0];
        double brokerSavings = savings[1];

        System.out.println("Vanya's savings: $" + vanyaSavings);
        System.out.println("Broker's savings: $" + brokerSavings);
    }

    public static double[] calculateSavings(int initialSalary, int expenses, double investmentPercentage, double investmentReturnRate, int months) {
        double vanyaSavings = 0;
        double brokerSavings = 0;

        for (int i = 1; i <= months; i++) {
            if (i % 6 == 0) {
                initialSalary += 400;
            }

            double investmentAmount = initialSalary * investmentPercentage;
            brokerSavings += investmentAmount * (1 + investmentReturnRate);

            vanyaSavings += initialSalary - expenses - investmentAmount;
        }

        return new double[]{vanyaSavings, brokerSavings};
    }
}
