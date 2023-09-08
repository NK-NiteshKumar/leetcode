class RandomizedSet {

    private final Map<Integer, Integer> keys;
    private final List<Integer> values;
    private final Random random = new Random();

    public RandomizedSet() {
        keys = new HashMap<>();
        values = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (keys.containsKey(val)) return false;
        keys.put(val, values.size());
        values.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!keys.containsKey(val)) return false;
        int candidateIndex = keys.get(val);
        int lastIndex = values.size() - 1;
        values.set(candidateIndex, values.get(lastIndex));
        keys.put(values.get(candidateIndex), candidateIndex);
        keys.remove(val);
        values.remove(lastIndex);
        return true;
    }

    public int getRandom() {
        return values.get(random.nextInt(values.size()));
    }
}

//https://leetcode.com/problems/insert-delete-getrandom-o1/
