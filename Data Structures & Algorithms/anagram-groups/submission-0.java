class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String,List<String>> ana = new HashMap<>();
        
        for (int i = 0; i < strs.length ; i ++){
            String word = strs[i];
            char [] chars = word.toCharArray();
            Arrays.sort(chars);

            String sortWord = new String(chars);
            if (ana.containsKey(sortWord)){
                List<String> anagrams = ana.get(sortWord);
                anagrams.add(strs[i]);
                ana.put(sortWord, anagrams);
            }
            else{

                List<String> anagrams = new ArrayList<>();
                anagrams.add(strs[i]);
                ana.put(sortWord, anagrams);
            }
            
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> i : ana.values()){
            result.add(i);

        }
        return result;
        
    }
}
