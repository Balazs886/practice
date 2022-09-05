public class RoK_For_02 {
    public static void main(String[] args) {
        int row = 0;
        int indentation = 0;
        for (int column = 1; column <= 10; column++) {
            if (column == 1) {
                for (int i = 0; i < indentation; i++ ) {
                    System.out.print(" ");
                }
                indentation++;
            }
            System.out.print("#");
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
