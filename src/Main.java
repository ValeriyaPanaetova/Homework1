public class Main {
    public static void main(String[] args) {
        int price = 13676;
        boolean miles = 20 == 1;

        int bonus;
        if (price > 20) {
            bonus = price / 20;
        } else {
            bonus = 0;
        }
        int bonusMiles = price / 20;
        System.out.println("Количество бонусных миль" + bonusMiles);


    }
}

