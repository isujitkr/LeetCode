class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>(); //1,2,3
        Set<Integer> set2 = new HashSet<>(); //1,2

        for(int num : nums1){
            set1.add(num);
        }

        for(int num : nums2){
            set2.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        //adding uinque element of set1 which not in set2
        for(int num : set1){
            if(!set2.contains(num)){
                list1.add(num);
            }
        }

        //adding uinque element of set2 which not in set2
        for(int num : set2){
            if(!set1.contains(num)){
                list2.add(num);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);

        return ans;

    }
}