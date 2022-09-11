package Main;

public class BasicGame {
    public static void main(String[] args) {
        String[][] level = new String[10][10];
        int row = 2;
        int col = 2;
        String playerMark = "O";

        Direction direction = Direction.RIGHT;
        for (int i = 0; i < level.length; i++) {
            for (int j = 0; j < level.length; j++) {
                level[i][j] = "x";
            }
        }

        for (int z = 0; z < 10; z++) {
            switch (direction) {
                case UP: row--;
                case DOWN: row++;
                case LEFT: col--;
                case RIGHT: col++;
            }
        }

        for (int k = 0; k < level.length; k++) {
            for (int j = 0; j < level[k].length; j++) {
                if (k == row && j == col) {
                    System.out.print(playerMark);
                }
                else {
                    System.out.print(level[k][j]);
                }
            }
            System.out.println();
        }
        System.out.println("--------");
        try {
            Thread.sleep(1000L);
        }
        catch (Exception e) {

        }
    }
}
