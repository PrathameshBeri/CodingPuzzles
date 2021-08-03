class Solution {
    public double myPow(double x, int n) {
        
        if(x == 1.0){
            return x;
        }
        if(x == -1.00 && n %2 == 0){
            return 1;
        }
        if(x  == -1.00 && n % 2 != 0){
            return -1;
        }
        
        if(n < 0){
            
            double exp = x;
            long k = n;
            for(long i = 1; i < Math.abs(k); i++){
                exp *= x;
                if(exp > 10000.00 && 1/exp == 0){
                    return 0.00;
                   
                }
            }
            //System.out.println(Math.abs(k));
            return 1/exp;
            
        }else if( n == 0){
            
            return 1;
        }else{
            
            
            double exp = x;
            for(long i = 1; i < n; i++){
                exp *= x;
                 if(exp > 10000.00){
                    exp = 10000.00;
                    break;
                }
            }
            
            return exp;
        }
    }
}