//1248

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {


        Map<Integer, Integer> hm = new HashMap<Integer,Integer>();

        hm.put(0,1);

        int count = 0;
        int oc = 0;

        for(int n : nums){

            if(n %2  != 0 ){
                oc++;

            }
            count += hm.getOrDefault(oc-k, 0);
            System.out.println(count);

            hm.put(oc, hm.getOrDefault(oc, 0) +1);

        }

        return count;
    }
}
