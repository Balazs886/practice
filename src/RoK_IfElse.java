public class RoK_IfElse {
    public static void main(String[] args) {
        int time = 16;
        if ( time > 23 || time < 0) {
            System.out.println("Hibás értéket adtál meg!");
        } else if (time > 21 || time < 6) {
            System.out.println("Jó éjszakát!");
        } else if (time < 22 && time > 17 ) {
            System.out.println("Jó estét!");
        } else if (time < 18 && time > 8) {
            System.out.println("Jó napot!");
        } else if (time < 9 && time > 5 ) {
            System.out.println("Jó reggelt!");
        }
    }
}