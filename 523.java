//523

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> hm = new HashMap<>();

        int count = 0;
        int sum = 0;
        int point = -1;
        boolean ss = false;
        hm.put(0,-1);

        for(int i = 0 ; i < nums.length; i++){

            sum += nums[i];
            if(k != 0){
                  sum %= k;
              }

           if(hm.containsKey(sum)){

               int n = hm.get(sum);
            if(i-n >= 2) {ss = true; break; }

           }else{

            hm.put(sum, i);
           }

        }

        return ss;
    }
}
