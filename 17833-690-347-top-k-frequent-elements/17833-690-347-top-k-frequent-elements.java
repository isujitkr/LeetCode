class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int counter = 0;
        for (int pos = bucket.length - 1;pos >= 0 && counter < k; pos--) {
            if (bucket[pos] != null) {
                for(Integer integer : bucket[pos]){
                    ans[counter++] = integer;
                }
            }
        }

        return ans;

    }
}