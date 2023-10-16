class GetRow {
    public List<Integer> getRow(int row) {
        List<Integer> list = new ArrayList<>();
        long start = 1;
        list.add((int)start);
        for(int i=0; i<row; i++)
        {
            start *= (row-i);
            start /= (i+1);
            list.add((int)start);
        }
        return list;
    }
}

//https://leetcode.com/problems/pascals-triangle-ii/
