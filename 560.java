//560
class Solution {
    public int subarraySum(int[] nums, int k) {

        if(nums.length == 1 && nums[0] != k) return 0;

       HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int count = 0;

        hm.put(0,1);

        for(int n : nums){

            sum += n;

            count += hm.getOrDefault(sum -k, 0);

            hm.put(sum, hm.getOrDefault(sum, 0) +1);



        }

        return count;

    }
}
