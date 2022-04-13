public class Main {
    public static void main(String[] args) {
        int[] playersSpeeds = new int[]{10, 5, 0, 1, 0}; //Задаём скорости игроков
        System.out.println("Кол-во выбывших игроков: " + Svetofor.numberOfLosers(playersSpeeds)); // Вывод числа выбывших игроков
        System.out.print("Скорости выбывших игроков: ");
        Svetofor.printArray(Svetofor.speedsOfLoserPlayers(playersSpeeds)); //Вывод скоростей выбывших игроков
        System.out.println("");
        System.out.print("Скорости победивших игроков: ");
        Svetofor.printArray(Svetofor.speedsOfWinnerPlayers(playersSpeeds)); //Вывод скоростей выбывших игроков

    }

}
