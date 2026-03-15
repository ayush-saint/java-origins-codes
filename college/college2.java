public class college2 {
    public static void college2(int toRows, int TotCols) {
        for (int i = 1; i <= toRows; i++) {
            for (int j = 1; j <= TotCols; j++) {
                if (i == 1 || i == toRows || j == 1 || j == TotCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        empty_rectangle(4, 5);
    }
}