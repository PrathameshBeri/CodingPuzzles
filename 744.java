//744

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int min = Integer.MAX_VALUE;
        char cmin = 'a';
        boolean f = false;

        for(int i = 0 ; i < letters.length; i++){

            int u = letters[i] - target;

            if(u > 0 && min > u){
                //System.out.println(min);
                min = u;
                cmin = letters[i];
                f = true;
            }

        }

        if(!f){
             min = 0;
              for(int i = 0 ; i < letters.length; i++){

            int u = Math.abs(letters[i] - target);

            if( min < u){
                //System.out.println(min);
                min = u;
                cmin = letters[i];

            }

        }

        }

        return cmin;
    }
}
