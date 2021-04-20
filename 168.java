//168

class Solution {
    public String convertToTitle(int n) {


        final int base_adjustment = 64;
        StringBuilder s = new StringBuilder();
        int test = n;

        while(test > 0){

         if( test <= 26){
             s.append((char)(test+base_adjustment));
             break;
         }

            int rem = test%26;
            if(rem > 0){
                s.append((char)(rem+base_adjustment));
                test = test - rem;
                test = test/26;
            }else{

            int quot = test/26;
            if(quot > 0){

                s.append((char)(26 + base_adjustment));
                test = quot - 1;
            }



        }


    }

        return (s.reverse().toString());
}

}
