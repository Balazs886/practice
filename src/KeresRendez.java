import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class KeresRendez {

    public static Integer[] input = {15, 12, 554, 31, 33, 22, 54, 74, 143, 553, 732, 1231, 3, 56, 48, 19, 28};
    static Random rand = new Random();

    public static void main(String args[]) {
        Integer[] testData = input; // for developing
//        Integer[] testData = generateArray(); // for testing
        Instant start = Instant.now(); // start stopwatch after generated test data set
        /*------------------------------------------*/

        Integer result = findMin(testData);

        /*------------------------------------------*/
        System.out.printf("result: %s\n", result);
        System.out.printf("executing time: %s ms\n", Duration.between(start, Instant.now()).toMillis());
    }

    static Integer findMin(Integer[] testData) {
        //return Collections.min(Arrays.asList(testData)); // this is the correct answer, but not for the rookie programmer.
        return 0; // TODO: 2022. 09. 08. Implement it
    }

    static Integer findMax(Integer[] testData) {
        //return Collections.max(Arrays.asList(testData)); // this is the correct answer, but not for the rookie programmer.
        return 0; // TODO: 2022. 09. 08. Implement it
    }

    static Integer calcAvg(Integer[] testData) {
        return 0;// TODO: 2022. 09. 08. Implement it
    }


    /**
     * This method generate test data.
     * @return very big Array for the tests
     */
    static Integer[] generateArray() {
        Set<Integer> result = new HashSet<>();
        do {
            result.add(rand.nextInt(99_999_999) + 1);
        } while (result.size() < 100_000);
        return result.toArray(new Integer[result.size()]);
    }


}
