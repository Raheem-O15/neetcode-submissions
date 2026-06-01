class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for (int i = 0;i < s.length();i++){
            if (countS.containsKey(s.charAt(i))){
                Integer x = countS.get(s.charAt(i)) + 1;
                countS.put(s.charAt(i), x);
            }
            else{
                countS.put(s.charAt(i), 1);
            }
            if (countT.containsKey(t.charAt(i))){
                Integer x = countT.get(t.charAt(i)) + 1;
                countT.put(t.charAt(i), x);
            }
            else{
                countT.put(t.charAt(i), 1);
            }
        }
        return countS.equals(countT);
        
    }
}
