/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int l = 0;
        int h = n;
        int num = 0;
        while(num < n){
            num =   l + ((h-l) /2);
            int x = guess(num);
            if(x == 0){
                return num;
            }
            else if(x == 1){
                l = num +1;
                
            }else{
                
               h = num -1;
            }
        }
        return num;
    }
}