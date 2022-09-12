package BasicIntro;

public class BasicIntro {
    public static void main(String[]args) {
        int row = 10;
        int col = 10;
        int playerRowPosition = 2;
        int playerColPosition = 2;
        Direction direction = Direction.RIGHT;

        for (int k = 0; k < 40; k++) {


            switch (direction) {
                case UP: playerRowPosition--;break;
                case DOWN:  playerRowPosition++;break;
                case RIGHT: playerColPosition++;break;
                case LEFT: playerColPosition--;break;
            }

            if (playerRowPosition == 8 && direction != Direction.LEFT) {
                direction = Direction.LEFT;
            } else if (playerRowPosition == 1 && direction != Direction.RIGHT) {
                direction = Direction.RIGHT;
            } else if (playerColPosition == 8 && direction != Direction.DOWN) {
                direction = Direction.DOWN;
            } else if (playerColPosition == 1 && direction != Direction.UP) {
                direction = Direction.UP;
            }


            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i == 0 || i == 9 || j == 0 || j == 9) {
                        System.out.print("×");
                    } else if (i == playerRowPosition && playerColPosition == j) {
                        System.out.print("◌");
                    }
                    else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
            try {
                Thread.sleep(500l);
            } catch (Exception e) {

            }
            if (k == 39) {
                System.out.println("The End!");
            }
        }
    }
}

