package ru.netology.bonus;

public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();
        long bonus = service.calculate(5_000, true);
        System.out.println("получился бонус:" + bonus);
    }
}