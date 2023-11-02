package com.learn.questions.day16;
import java.util.*;

public class RandomizedSet {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
        randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
        System.out.println(randomizedSet.getRandom()); // getRandom() should return either 1 or 2 randomly.
        randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
        randomizedSet.insert(2); // 2 was already in the set, so return false.
        System.out.println(randomizedSet.getRandom());// Since 2 is the only number in the set, getRandom() will always return 2.
    }
    private final List<Integer> list;
    private final Map<Integer, Integer> idxMap;
    private Random random;

    public RandomizedSet() {
        list=new ArrayList<>();
        idxMap = new HashMap<>();
        random = new Random();

    }

    public boolean insert(int val) {
        if (idxMap.containsKey(val)) {
            return false;
        }

        idxMap.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!idxMap.containsKey(val)) {
            return false;
        }
        int idx = idxMap.get(val);
        int lastIdx = list.size() - 1;

        if (idx != lastIdx) {
            int lastVal = list.get(lastIdx);
            list.set(idx, lastVal);
            idxMap.put(lastVal, idx);
        }
        list.remove(lastIdx);
        idxMap.remove(val);
        return true;

    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
