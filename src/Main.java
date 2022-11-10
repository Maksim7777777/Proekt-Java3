public class Main {
    public static void main(String[] args) {
        int ticket = 1985; // стоимость биллета
        int mile = 20; // количества рублей для одной бонусной мили
        int bonus = (ticket / mile); // количество бонусных миль
        System.out.println(bonus + " бонусных миль");

    }
}
