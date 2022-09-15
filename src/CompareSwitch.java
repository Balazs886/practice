import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class CompareSwitch {
    static Random rand = new Random();

    public static void main(String args[]) {
        List<Integer> testData = generateData();
        test4(testData);
        test3(testData);
        test2(testData);
        Integer[] result = test1(testData);

        test1(testData);
        test2(testData);
        test3(testData);
        test4(testData);

        test4(testData);
        test3(testData);
        test2(testData);
        test1(testData);

        printResult(result);
    }


    /**
     * Test If structure without else
     */
    static Integer[] test1(List<Integer> input) {
        Instant start = Instant.now();
        Integer[] result = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (Integer integer : input) {
            if (integer == 0) {
                result[0]++;
            }
            if (integer == 1) {
                result[1]++;
            }
            if (integer == 2) {
                result[2]++;
            }
            if (integer == 3) {
                result[3]++;
            }
            if (integer == 4) {
                result[4]++;
            }
            if (integer == 5) {
                result[5]++;
            }
            if (integer == 6) {
                result[6]++;
            }
            if (integer == 7) {
                result[7]++;
            }
            if (integer == 8) {
                result[8]++;
            }
            if (integer == 9) {
                result[9]++;
            }
        }
//        printResult(result);
        System.out.printf("executing test1: %s ms\n", Duration.between(start, Instant.now()).toMillis());
        return result;
    }

    /**
     * Test If structure with else-if
     */
    static void test2(List<Integer> input) {
        Instant start = Instant.now();
        Integer[] result = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (Integer integer : input) {
            if (integer == 0) {
                result[0]++;
            } else if (integer == 1) {
                result[1]++;
            } else if (integer == 2) {
                result[2]++;
            } else if (integer == 3) {
                result[3]++;
            } else if (integer == 4) {
                result[4]++;
            } else if (integer == 5) {
                result[5]++;
            } else if (integer == 6) {
                result[6]++;
            } else if (integer == 7) {
                result[7]++;
            } else if (integer == 8) {
                result[8]++;
            } else if (integer == 9) {
                result[9]++;
            }
        }
//        printResult(result);
        System.out.printf("executing test2: %s ms\n", Duration.between(start, Instant.now()).toMillis());
    }

    /**
     * Test switch
     */
    static void test3(List<Integer> input) {
        Instant start = Instant.now();
        Integer[] result = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (Integer integer : input) {
            switch (integer) {
                case 0:
                    result[0]++;
                    break;
                case 1:
                    result[1]++;
                    break;
                case 2:
                    result[2]++;
                    break;
                case 3:
                    result[3]++;
                    break;
                case 4:
                    result[4]++;
                    break;
                case 5:
                    result[5]++;
                    break;
                case 6:
                    result[6]++;
                    break;
                case 7:
                    result[7]++;
                    break;
                case 8:
                    result[8]++;
                    break;
                case 9:
                    result[9]++;
                    break;
            }
        }
//        printResult(result);
        System.out.printf("executing test3: %s ms\n", Duration.between(start, Instant.now()).toMillis());
    }

    /**
     * Test hash set
     */
    static void test4(List<Integer> input) {
        Instant start = Instant.now();
        Map<Integer, Integer> result = new HashMap();
        result.put(0, 0);
        result.put(1, 0);
        result.put(2, 0);
        result.put(3, 0);
        result.put(4, 0);
        result.put(5, 0);
        result.put(6, 0);
        result.put(7, 0);
        result.put(8, 0);
        result.put(9, 0);
        for (Integer integer : input) {
            result.put(integer, result.get(integer) + 1);
        }
//        System.out.println(result);
        System.out.printf("executing test4: %s ms\n", Duration.between(start, Instant.now()).toMillis());
    }


    static void printResult(Integer[] result) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s: %s\n", i, result[i]);
        }
    }


    /**
     * This method generate test data.
     *
     * @return very big Array for the tests
     */
    static List<Integer> generateData() {
        List<Integer> result = new ArrayList<>();
        do {
            result.add(rand.nextInt(10));
        } while (result.size() < 100_000_000);
        return result;
    }
}
