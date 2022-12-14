import java.util.stream.IntStream;

public class RoK_For_02 {
    public static void main(String[] args) {
        drawParallelogram(5, 5, 1);
        System.out.println();
        drawParallelogramV2(5, 5, 1);
    }

    public static void drawParallelogram(int width, int height, int slope) {
        for (int row = 0; row < height; row++) {
            System.out.println(" ".repeat(slope * row) + "#".repeat(width));
        }
    }

    public static void drawParallelogramV2(int width, int height, int slope) {
        IntStream.range(0, height).forEach(x -> System.out.println(" ".repeat(slope * x) + "#".repeat(width)));
    }


}
