//806


class Solution {
    public int[] numberOfLines(int[] widths, String S) {


        int count = 0;

        int tot = 0;

        for(int i = 0; i < S.length(); i++){


            char t = S.charAt(i);

            int pos = t - 'a';

            if((tot + widths[pos])  == 100 ){

                tot = 0;
                count++;

            } else if((tot + widths[pos])  > 100 ){

                tot = widths[pos];
                count++;
            }

            else{
                tot += widths[pos];
            }
        }
        if(tot > 0 ) count++;
        return new int[]{count, tot};
    }
}
