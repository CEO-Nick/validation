package second_chapter05_set_and_queue;

import java.util.HashSet;

public class HashSetSample {
    public static void main(String[] args) {
        HashSetSample sample = new HashSetSample();
        sample.HashSetClone();
    }

    public void HashSetClone() {
        HashSet<Item> set1 = new HashSet<>();
        set1.add(new Item(1, "item1"));
        set1.add(new Item(2, "item2"));
        set1.add(new Item(3, "item3"));

        HashSet<Item> set2 = (HashSet<Item>) set1.clone();

        set1.add(new Item(4, "item4"));

        System.out.println("set1 : " + set1);
        System.out.println("set2 : " + set2);

//        System.out.println("isSameObject?" + set1.);
    }
}

class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }
}