//728

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> ans = new ArrayList<>();

        for(int i = left; i <= right; i++){

            int copy = i;

            boolean f = true;
            while(copy > 0){

                int r = copy%10;
                if(r == 0){
                    f = false;
                    break;
                }
                if((i%r) != 0){
                    f = false;
                    break;
                }
                copy = copy/10;
            }
            if(f) ans.add(i);


        }

        return ans;

    }
}
