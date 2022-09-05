public class RoK_For {
    public static void main(String[] args) {
        int row = 0;
        for (int column = 1; column <= 10; column++) {
            System.out.print("*");
            if (column == 10) {
                System.out.print("\n");
                column = 0;
                row++;
            }
            if (row == 5) {
                break;
            }
        }
    }
}
