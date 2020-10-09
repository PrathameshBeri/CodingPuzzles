//657

class Solution {
    public boolean judgeCircle(String moves) {

        int x = 0;
         int y = 0;

        for(int k =0; k < moves.length(); k++){

            Character j = moves.charAt(k);

            switch(j){
                case 'U': y++; break;
                case 'D': y--; break;
                case 'L': x--; break;
                case 'R': x++; break;

            }
        }
        System.out.println(x + " " + y);
        if(x ==0 && y == 0) return true;
        else return false;

    }
}
