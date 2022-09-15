package pyramid;

public class Pyramid {
    public static void main(String[] args) {
        int rowPosition1 = 0;
        int colPosition1 = 0;
        int rowPosition2 = 0;
        int colPosition2 = 0;

        int pyramid[][];
        pyramid = new int[4][4];
        int counter = 1;
        int askedNumber = 5;

        for (int row = 0; row < pyramid.length; row++) {
            for (int col = 0; col < pyramid[row].length; col++) {
                if (col <= row) {
                    pyramid[row][col] = counter;
                    counter++;
                }
                System.out.print(pyramid[row][col]);
                if (pyramid[row][col] == askedNumber) {
                    rowPosition1 = row + 1;
                    colPosition1 = col;

                    rowPosition2 = row + 1;
                    colPosition2 = col + 1;
                }
            }
            System.out.println();
        }
        System.out.println("A kért szám: " + askedNumber);
        System.out.print("Az eredmény: " + pyramid[rowPosition1][colPosition1] + " és " + pyramid[rowPosition2][colPosition2]);
    }
}