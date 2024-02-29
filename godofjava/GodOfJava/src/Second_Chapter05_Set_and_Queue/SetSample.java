package Second_Chapter05_Set_and_Queue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String[] cars = new String[]{
                "Tico", "Sonata", "BMW", "Benz",
                "Lexus", "Mustang", "Grandeure",
                "The Beetle", "Mini Cooper", "i30",
                "BMW", "Lexus", "Carnibal", "SM5",
                "SM7", "SM3", "Tico"
        };
        System.out.println(sample.getCarKinds(cars));
        }

    public int getCarKinds(String[] cars) {
        HashSet<String> carKinds = new HashSet<>(List.of(cars));
        Iterator<String> iterator = carKinds.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        return carKinds.size();
    }
}