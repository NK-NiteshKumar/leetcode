class ComputeArea {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int overlapLength = Math.min(bx2, ax2) -Math.max(ax1, bx1);
        int overlapWidth = Math.min(ay2, by2) - Math.max(ay1, by1);

        int overlapAr=0;
        if(overlapLength>0 && overlapWidth>0)
        {
            overlapAr = overlapLength * overlapWidth;
        }
        return Math.abs((ay2-ay1)*(ax2-ax1)) + Math.abs((by2-by1)*(bx2-bx1)) - overlapAr;
    }
}

//https://leetcode.com/problems/rectangle-area/
