//821

class Solution {
    public int[] shortestToChar(String S, char C) {

        int[] len = new int[S.length()];


        for(int i = 0; i < S.length(); i++){
            int u = S.indexOf(C, i);
            int y = S.lastIndexOf(C, i);

            if( y < 0 ) {y = Integer.MAX_VALUE;}

           int po = Math.abs(u - i) > Math.abs(i - y) ? Math.abs(i - y) : Math.abs(u - i);

            len[i] = po;
        }


        return len;
    }
}
