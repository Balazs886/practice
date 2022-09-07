import java.util.Scanner;

public class PostmodernATM {
    public static void main(String[] args) {
        int banknotes[] = {5, 10, 20, 50, 100, 200, 500, 1_000, 2_000, 5_000, 10_000, 20_000};
        int[] cash = new int[banknotes.length];
        int step = banknotes.length - 1;
        int requiredCash;

        //Adatbekérés
        boolean isInputCorrect = false;
        do {
            System.out.println("Kérlek add meg az igényelt összeget: ");
            Scanner scanner = new Scanner(System.in);
            int totalRequiredCash = scanner.nextInt();
            requiredCash = totalRequiredCash;
            if (totalRequiredCash > 4 && totalRequiredCash < 500_001) {
                isInputCorrect = true;
            } else {
                System.out.println("Hibás összeget adtál meg! Kérlek 5 és 500 000 Ft közötti értéket adj meg.");
            }
            if (requiredCash % 5 != 0) {
                System.out.println("Az automata 5 Ft-nál kisebb érmét nem tud kiadni. Ezt kérlek vedd figyelembe az összeg megadása során.");
                isInputCorrect = false;
            }
        } while (isInputCorrect == false);

        //Címletek leszámolása kevesebb erőforrással
        while (step >= 0) {
           cash[step] = requiredCash / banknotes[step];
           requiredCash = requiredCash % banknotes[step];
           step--;
        }

        // Kiiratás
        System.out.println("Kiadott címletek:");
        for (int i = 0; i < banknotes.length; i++) {
            System.out.println(banknotes[i] + " Ft: " + cash[i] + " db");
        }
    }
}