class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<>();

        for (int i = 0 ;i < nums.length ;i++){
            int current = nums[i];
            int complement = target - current;
            if (sum.containsKey(complement)){
                
                int[] ans = {sum.get(complement), i }; 
                return ans;
            }
            sum.put(current, i);
        }
        return null;
        
    }
}
