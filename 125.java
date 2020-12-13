//125

class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        int y = s.length() - 1;

        for(int i = 0; i < y; i++){

            char t = s.charAt(i);
            char v = s.charAt(y);
            if(!Character.isLetterOrDigit(t)){
                continue;
            }

            while(!Character.isLetterOrDigit(v)){
                y--;
                v = s.charAt(y);

            }

            char ut = Character.toUpperCase(t);
            char vt = Character.toUpperCase(v);
            if(ut != vt){
                return false;
            }

            y--;

        }
         return true;
    }


}
