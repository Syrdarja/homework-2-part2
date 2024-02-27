//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initial_balance = 100; // изначальный баланс
        int refill = 1100; //пополнение счета
        int bonus = refill / 100;// бонус за каждые 100 рублей
        if (refill > 1000) {
            int amount = initial_balance + refill + bonus;
            System.out.println("Итоговая сумма-" + amount + "руб.; Бонусы-" + bonus + "руб.");

        } else {
            int amount1 = initial_balance + refill;
            System.out.println("Итоговая сумма-" + amount1 + "руб.; Бонусы - 0 руб.");
                   }
    }

}