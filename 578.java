//578

class Solution {
    public int subarraysDivByK(int[] A, int K) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        int count = 0;
        int tot = 0;
        hm.put(0,1);
        for(int u : A){
            tot = (tot+u) % K;
            if(tot < 0) tot += K;

            int rem = tot%K;

            count += hm.getOrDefault((rem), 0);

            hm.put(rem, hm.getOrDefault(rem, 0) +1);


        }

        return count;
    }
}
