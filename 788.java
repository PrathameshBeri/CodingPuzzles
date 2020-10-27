//788
class Solution {
    public int rotatedDigits(int N) {

        Set<Integer> set = Set.of(2,5,6,9);
        Set<Integer> invalidset = Set.of(3,7,4);
        Set<Integer> selfSet = Set.of(0,1,8);

        int count = 0;

        for(int i = 1; i <= N; i++){


            int u = i;
            int len = 0;
            int noofsame=0;
            boolean rotatable = true;
            boolean nochange = false;
            while(u > 0){


                int k = u%10;
                if(invalidset.contains(k)) {rotatable = false; break;}
                if(selfSet.contains(k)) {noofsame++;}
                len++;
                u = u/10;
            }

        if(rotatable && len != noofsame) count++;

        }
        return count;
    }
}
