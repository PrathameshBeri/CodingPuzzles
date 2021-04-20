//326

class Solution {
    public boolean isPowerOfThree(int n) {

        Double k = Math.log10(n)/Math.log10(3);

       return k%1 == 0;
    }
}
