public class Bonus {
    public static void main(String[] args) {
        int account = 290;
        int amount = 1890;
        int totalBonus = 1;

        account += amount;
        int bonus;
        if (amount > 1000) {
            bonus = (amount - 1000) / 100;
            totalBonus += bonus;
        }
        System.out.println("Счет: " + account);
        System.out.println("Бонус: " + totalBonus);
    }
}
