package second_chapter06_map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    public static void main(String[] args) {
        RandomNumberStatistics sample = new RandomNumberStatistics();
        sample.getRandomNumberStatistics();

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", null);
        if (hashMap.get("1") == null) {
            System.out.println(hashMap.get("1"));
        }
    }

    private final int DATA_BOUNDARY = 50;

    Hashtable<Integer, Integer> hashtable = new Hashtable<>();

    public void getRandomNumberStatistics() {
        for (int i = 0; i < 5000; i++) {
            Random random = new Random();
            putCurrentNumber(random.nextInt(1, DATA_BOUNDARY+1));
        }
        printStatistics();
    }

    public void putCurrentNumber(int tempNumber) {
        if (hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, hashtable.get(tempNumber)+1);
        }
        else {
            hashtable.put(tempNumber, 1);
        }
    }

    public void printStatistics() {
        Set<Integer> keySet = hashtable.keySet();
        for (int key:keySet) {
            System.out.print(key + "=" + hashtable.get(key) + "\t");
            // key가 1로 끝날 때마다 줄바꿈 넣자 -> 그래야 한 줄에 10개씩 이쁘게 출력
            if (key%10-1==0) System.out.println();
        }
    }
}
