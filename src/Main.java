public class Main {
    public static void main(String[] args) {
        int balans = 300; // деьги на счету у клиента
        int popolnenieBalansa = 1550; // пополнение баланса
        int prosent = (popolnenieBalansa / 100);
        int itogSchet = (balans + popolnenieBalansa); // итоговый счет
        if (popolnenieBalansa >= 1000) {
             System.out.println(prosent + " бонусных рублей на счету"); // бонусных рублей на счету
             System.out.println(balans + popolnenieBalansa + prosent + " рублей на счету"); // итоговый счес с %
        } else {
            System.out.println(itogSchet + " рублей на счету"); // итоговый счет без %
        }

    }
}