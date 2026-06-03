class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String clean = "";

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (Character.isLetterOrDigit(current)) {
                clean = clean + current;
            }
        }

        char[] chars = clean.toCharArray();

        int k = chars.length/2;;
        
        for (int i = 0;i < k;i++){
            int x = i + 1;
            int j = chars.length - x;
            if (chars[i] == chars[j]){
                if (i + 1 >= k){
                    return true;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }
}
