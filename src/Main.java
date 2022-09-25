public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int month = 1;
        int amount = 15_000;
        while (amount < 12_000_000) {
            amount += amount * 0.07;
            System.out.println("Месяц " + month + ", сумму накоплений равна " + amount + " рублей");
            month++;
        }

        // Задание 2
        System.out.println("Задание 2");
        int month_2 = 1;
        int amount_2 = 15_000;
        while (amount_2 < 12_000_000) {
            amount_2 += amount_2 * 0.07;
            if (month_2 % 6 == 0) {
                System.out.println("Месяц " + month_2 + ", сумму накоплений равна " + amount_2 + " рублей");
            }
            month_2++;
            }

        // Задание 3
        System.out.println("Задание 3");
        int month_3 = 1;
        int amount_3 = 15_000;
        while (month_3 <= 9 * 12) {
            amount_3 += amount_3 * 0.07;
            if (month_3 %6 == 0) {
                System.out.println("Месяц " + month_3 + ", сумму накоплений равна " + amount_3 + " рублей");
            }
            month_3++;
        }

        // Задание 4
        System.out.println("Задание 4");
        int lastDayInMonth = 31;
        int firstFridayInMonth = 2;
        while (firstFridayInMonth <= lastDayInMonth) {
            System.out.println("Сегодня пятница, " + firstFridayInMonth + "-е число");
            firstFridayInMonth += 7;
        }
    }

}