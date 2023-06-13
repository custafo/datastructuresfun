import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        int N = 500000;
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            numbers.add(random.nextInt(N));
        }
        Collections.sort(numbers);
        for (int i = 0; i < 30; i++) {
            Integer key = random.nextInt(N);
            long start = System.currentTimeMillis();
            // numbers.cointais(key)
            Collections.binarySearch(numbers, key);
            long end = System.currentTimeMillis();
            long elapsedTime = end - start;
            System.out.println(elapsedTime);
        }
    }
}