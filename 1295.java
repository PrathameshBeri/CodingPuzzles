//1295

class Solution {
    public int findNumbers(int[] nums) {


        int count = 0;
        for(int i : nums){

            String d = Integer.valueOf(i).toString();
            if(d.length() %2 == 0){
                count++;
            }
        }

        return count;
    }
}
