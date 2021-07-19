public class Bonus {
    public static void main(String[] args) {
        int account = 200;
        int amount = 1790;
        int bonus;

        account += amount;
        if (amount > 1000) {
            bonus = (amount - 1000) / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Счет: " + account);
        System.out.println("Бонус: " + bonus);
    }
}
