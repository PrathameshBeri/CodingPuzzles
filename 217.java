//217 contains duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {

        int n = nums.length;
        if(n < 2) return false;

        Set<Integer> s = new HashSet<>();

        for(int i = 0; i< n; i++){
            s.add(nums[i]);
        }

        if(s.size() == nums.length) return false;

        return true;

    }
}
