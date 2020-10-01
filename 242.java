//242

class Solution {
    public boolean isAnagram(String s, String t) {
        int k  = s.length();
        int a = t.length();
        if(k != a) return false;

       char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        int l = 0;
        while(l < k){

            if(c1[l] != c2[l]) return false;
            l++;
        }

        return true;
    }
}
