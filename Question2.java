public class Question2 {
    public static  int ans(String s) {
        int[] charFreq = new int[26];

        for (char c : s.toCharArray()) {
            charFreq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charFreq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       String s="loveleetcode";
        System.out.println(ans(s));
    }
}
