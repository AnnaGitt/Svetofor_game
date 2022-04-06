public class Svetofor {
    public static boolean isGreenLight = false;

    public static String isPlayerWin(int speedOfPlayer) {
        String result = "";
        if (isGreenLight) {   // зеленый
            result = "Игрок со скоростью " + speedOfPlayer + " выйграл, так как цвет сфетофора зелёный!";
        } else if (speedOfPlayer > 0) { // красный
            result = "Игрок со скоростью " + speedOfPlayer + " проиграл, так как цвет сфетофора красный!";
        } else {
            result = "Игрок со скоростью " + speedOfPlayer + " выйграл, так как цвет сфетофора красный!!";
        }
        return result;
    }
}

