public class NestedIterator implements Iterator<Integer> {

    List<Integer> flattenedList; 
    int index;

    public NestedIterator(List<NestedInteger> nestedList) {
        flattenedList = new ArrayList<>(); 
        index = 0;
        flatten(nestedList);
    }

    private void flatten(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInt : nestedList) {
            if (nestedInt.isInteger()) {
                flattenedList.add(nestedInt.getInteger());
            } else {
                flatten(nestedInt.getList()); // 
            }
        }
    }

    @Override
    public Integer next() {
        return flattenedList.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < flattenedList.size(); 
    }
}

//https://leetcode.com/problems/flatten-nested-list-iterator/
