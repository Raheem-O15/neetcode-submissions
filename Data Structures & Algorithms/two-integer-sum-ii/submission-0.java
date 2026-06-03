class Solution {
    public int[] twoSum(int[] numbers, int target) {
         HashMap<Integer, Integer> sum = new HashMap<>();

        for (int i = 0 ;i < numbers.length ;i++){
            int current = numbers[i];
            int complement = target - current;
            if (sum.containsKey(complement)){
                
                int[] ans = {sum.get(complement)+1, i + 1 }; 
                return ans;
            }
            sum.put(current, i);
        }
        return null;
    }
}
