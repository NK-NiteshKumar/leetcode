class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        var ans = new ArrayList<String>();
        var n = nums.length;
        var sb = new StringBuilder();
        for(int i=0;i<n;i++){
            var start = nums[i];
            while(i+1<n && nums[i]+1==nums[i+1])i++;
            sb.append(start);
            if(start!=nums[i]) ans.add(sb.append("->").append(nums[i]).toString());
            else ans.add(sb.toString());
            sb.setLength(0);
        }return ans;
    }
}

//https://leetcode.com/problems/summary-ranges/
