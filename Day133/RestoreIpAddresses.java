class RestoreIpAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> ls = new ArrayList<String>();
        r(s.toCharArray(), ls, new Stack<String>(), 0, 4);
        return ls;
    }

    public void r(char[] s, List<String> rs, Stack<String> ss, int i, int c) {
        // cl - characters left
        var cl = s.length -i;
        if (c == 1) {
            if (cl > 3 || cl == 0) return;
            // 3 characters left, last group
            if (cl == 3 && 
                (s[i] > '2' || 
                 (s[i] == '2' && 
                  (s[i+1] > '5' || 
                   (s[i+1] == '5' && s[i+2] > '5'))))) return;

            // leading zero, only one character should be left.
            if (s[i] == '0' && cl != 1) return;

            // build and join the string
            var sb = new StringBuilder();
            for(; i < s.length; i++) sb.append(s[i]);

            var fs = new StringBuilder();
            for(var j: ss) {
                fs.append(j);
                fs.append('.');
            }
            fs.append(sb.toString());
            rs.add(fs.toString());
            return;
        }

        if (cl > c * 3 || (cl < c)) 
            return;
        // assume this number is made of 1 digit
        var sb = new StringBuilder();
        sb.append(s[i]);
        ss.push(sb.toString());
        r(s, rs, ss, i+1, c-1);
        ss.pop();
        
        // assume this number is made of 2 digits
        if (s[i] == '0') return;
        if (i + 1 > s.length) return;
        sb.append(s[i + 1]);
        ss.push(sb.toString());
        r(s, rs, ss, i+2, c-1);
        ss.pop();

        // assume this number is made of 3 digits
        if (i + 2 >= s.length) return;
        if (s[i] > '2' || 
             (s[i] == '2' && 
              (s[i+1] > '5' || 
               (s[i+1] == '5' && s[i+2] > '5')))) return;
                
        sb.append(s[i + 2]);
        ss.push(sb.toString());
        r(s, rs, ss, i + 3, c - 1);
        ss.pop();
    }
    
}

//https://leetcode.com/problems/restore-ip-addresses/
