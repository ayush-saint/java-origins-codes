public class Main {
    public static void empty_rectangle(int totalRows, int totalCols) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalCols; j++) {
                if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        empty_rectangle(4, 5);
    }
}
