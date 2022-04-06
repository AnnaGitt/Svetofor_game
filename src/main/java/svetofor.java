public class svetofor {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 3;
        int speedOfPlayer2 = 2;
        int speedOfPlayer3 = 1;

        int count = 0;   // количество выбывших игроков

        if (isGreenLight) {   // зеленый
            System.out.println("Зеленый");
            System.out.println("Проходят все игроки");
        } else {   // красный
            if (speedOfPlayer1 > 0) count++;
            if (speedOfPlayer2 > 0) count++;
            if (speedOfPlayer3 > 0) count++;
            System.out.println("Красный");
            System.out.println("Количество выбывших игроков = " + count);
        }
    }
}

