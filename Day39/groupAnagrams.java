class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, ArrayList<String>> map = new HashMap<>();

        for( String s: strs ){

            String key = getKey(s);

            ArrayList<String> ll = map.getOrDefault( key,
            new ArrayList<String>() );
            ll.add(s);
            map.put( key, ll );
                                 
        }

        List<List<String>> ans = new ArrayList<>();
        for( Map.Entry<String, ArrayList<String>> entry: map.entrySet() ){
            ans.add( entry.getValue() );
        }

        return ans;
    }

    private String getKey(String s){
        int prod = 1, xor = 0;
        for(int len=0; len<s.length(); len++){
            char i = s.charAt(len);
            prod *= i;
            xor = xor^i;
        }
        return String.valueOf(prod) + '_' + String.valueOf(xor);
    }

}

//https://leetcode.com/problems/group-anagrams/
