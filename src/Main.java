public class Main {
    public static void main(String[] args) {
        int balance = 300; // деьги на счету у клиента
        int replenishmentBalance = 1550; //пополнение баланса.
        int percent = (replenishmentBalance / 100);
        int outcomeCheck = (balance + replenishmentBalance); //итоговый счет
        if (replenishmentBalance >= 1000) {
            System.out.println(percent + " бонусных рублей на счету"); // бонусных рублей на счету
            System.out.println(balance + replenishmentBalance + percent + " рублей на счету"); // итоговый счес с %
        } else {
            System.out.println(outcomeCheck + " рублей на счету"); // итоговый счет без %
        }

    }
}
