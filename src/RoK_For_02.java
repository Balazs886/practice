public class RoK_For_02 {
    public static void main(String[] args) {
        drawParallelogram(5, 5, 1);
    }

    public static void drawParallelogram(int width, int height, int slope) {
        for (int row = 0; row < height; row++) {
            System.out.println(" ".repeat(slope * row) + "#".repeat(width));
        }
    }
}
