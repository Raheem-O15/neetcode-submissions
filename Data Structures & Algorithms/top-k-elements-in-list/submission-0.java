class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (count.containsKey(nums[i])){
                int x = count.get(nums[i]);
                count.put(nums[i],x + 1);
            }
            else{
                count.put(nums[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            result.add(entry);

        }

        result.sort((a, b) -> b.getValue() - a.getValue());

        int[] answer = new int[k];
        for (int i = 0;i < k; i++){
            int x = result.get(i).getKey();
            answer[i] = x;

        }

        return answer;
        
    }
}
