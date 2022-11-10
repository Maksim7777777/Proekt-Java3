public class Main {
    public static void main(String[] args) {
        int balans = 300; // деьги на счету у клиента
        int popolneniyeBalansa = 1550; //пополнение баланса.
        int protsent = (popolneniyeBalansa / 100);
        int itogSchot = (balans + popolneniyeBalansa); //итоговый счет
        if (popolneniyeBalansa >= 1000) {
            System.out.println(protsent + " бонусных рублей на счету"); // бонусных рублей на счету
            System.out.println(balans + popolneniyeBalansa + protsent + " рублей на счету"); // итоговый счес с %
        } else {
            System.out.println(itogSchot + " рублей на счету"); // итоговый счет без %
        }

    }
}