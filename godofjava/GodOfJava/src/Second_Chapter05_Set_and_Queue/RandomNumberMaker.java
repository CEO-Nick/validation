package Second_Chapter05_Set_and_Queue;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker sample = new RandomNumberMaker();
        for (int i = 0; i < 10; i++) {
            System.out.println(sample.getSixNumber());
        }
    }

    public HashSet<Integer> getSixNumber() {
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        while (true) {
            int temp = random.nextInt(45);
            hashSet.add(temp);

            if (hashSet.size() >= 6) break;
        }

        return hashSet;
    }
}
