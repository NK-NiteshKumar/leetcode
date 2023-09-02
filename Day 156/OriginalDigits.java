class OriginalDigits {
    public String originalDigits(String s) {
    int[] count = new int[26];
    char[] chars = s.toCharArray();

    for (char c : chars) {
        count[c - 'a']++;
    }

    int[] digitCount = new int[10]; 
    digitCount[0] = count['z' - 'a'];
    digitCount[2] = count['w' - 'a'];
    digitCount[4] = count['u' - 'a'];
    digitCount[6] = count['x' - 'a'];
    digitCount[8] = count['g' - 'a'];
    digitCount[3] = count['h' - 'a'] - digitCount[8];
    digitCount[5] = count['f' - 'a'] - digitCount[4];
    digitCount[7] = count['s' - 'a'] - digitCount[6];
    digitCount[9] = count['i' - 'a'] - digitCount[5] - digitCount[6] - digitCount[8];
    digitCount[1] = count['o' - 'a'] - digitCount[0] - digitCount[2] - digitCount[4];

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < digitCount[i]; j++) {
            result.append(i);
        }
    }
    return result.toString();
    }
}