//409


class Solution {
    public int longestPalindrome(String s) {

        Set<Character> se = new HashSet<>();
        int n = s.length();
        int count = 0;

        for(int i = 0 ; i < n; i++){
            char o = s.charAt(i);
            if(se.contains(o)){
                se.remove(o);
                count++;
            }
        else se.add(o);

               }

             count += count;
        if(count != n) count++;

              return count;


}
}
