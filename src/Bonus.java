public class Bonus {
    public static void main(String[] args) {
        int account = 200;
        int amount = 1790;
        int bonus;

        if (amount > 1000) {
            bonus = (amount - 1000) / 100;
            account += amount;
        } else {
            bonus = 0;
            account += amount;
        }
        System.out.println("Счет: " + account);
        System.out.println("Бонус: " + bonus);
    }
}
