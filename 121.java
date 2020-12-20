//121
class Solution {
    public int maxProfit(int[] prices) {

        int max = 0;

        int curr = Integer.MAX_VALUE;
        int prof = 0;

        for(int n : prices){

            curr = Math.min(curr, n);
            prof = Math.max(prof, n - curr);
            max = Math.max(prof, max);

        }

        return max;

    }
}
