//402


class Solution {
    public String removeKdigits(String num, int k) {

        StringBuilder soln = new StringBuilder();

        if((num.length() - k) <= 0 ) return "0";
        if(k == 0 ) return num;

        char[] nums = num.toCharArray();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < nums.length; i++){

            if(st.size() < 1 && nums[i] != '0') st.push(nums[i]);
            else{

                while(st.size() > 0 && k > 0 && st.peek() > nums[i]){
                    st.pop();
                    k--;
                }
                if(st.size() == 0 && nums[i] == '0') continue;
                st.push(nums[i]);

            }


        }

        while(st.size() > 0 && k-- > 0){
            st.pop();
        }

        if(st.size() == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while(st.size() > 0){
            sb.append(st.pop());
        }
        sb.reverse();

        return sb.toString();

    }
}


    
