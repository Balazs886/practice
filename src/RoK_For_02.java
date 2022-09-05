public class RoK_For_02 {
    public static void main(String[] args) {
        drawParallelogram(5,5);
    }

    public static void drawParallelogram(int width, int height){
        int row = 0;
        int indentation = 0;
        for (int column = 1; column <= width; column++) {
            if (column == 1) {
                for (int i = 0; i < indentation; i++ ) {
                    System.out.print(" ");
                }
                indentation++;
            }
            System.out.print("#");
            if (column == width) {
                System.out.print("\n");
                column = 0;
                row++;
            }
            if (row == height) {
                break;
            }
        }
    }
}
