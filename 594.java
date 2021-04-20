//594
class Solution {
    public int findLHS(int[] nums) {

        HashMap<Integer, Integer> fm = new HashMap<>();
        Set<Integer> numr = new HashSet<>();

        for(int i = 0; i < nums.length; i++){

            if(fm.containsKey(nums[i])){
                int freq = fm.get(nums[i]);
                fm.put(nums[i], freq+1) ;
            }else{

                fm.put(nums[i], 1);
                numr.add(nums[i]);
            }
        }

        if(fm.size() < 2) return 0;

        int max = 0;

        for(int m : numr){

            int localm = 0;
            int l = m-1;
            int h = m+1;
            int fmm = fm.get(m);
            int fl = fm.getOrDefault(l,0);
            int hl = fm.getOrDefault(h,0);

            localm = (fl+fmm) > (hl+fmm) ? (fl+fmm): (hl+fmm);
            if(localm == fmm) localm = 0;
            max = Math.max(max, localm);
        }
        if(max == 1) return 0;
        return max;
    }
}
