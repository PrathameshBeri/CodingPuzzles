//263


class Solution {
    public boolean isUgly(int num) {
        if(num <= 0){
            return false;
        }
        if(num == 1) return true;
        return primeFactors(num);
    }



   public boolean primeFactors(int number){

        int divisor = 2;
        List<Integer> list1 = new ArrayList<>();

        boolean op = true;
        while(number != 1 ){

            int div = divisor;
            int rootn = (int)Math.pow(number, 0.5) + 1;
              while(div < rootn){
                  if(number % div == 0){
                      if(div > 5){
                          return false;
                      }
                      list1.add(div);
                      number /= div;
                      break;
                  }else{
                      div++;

                  }
              }

             if(div == rootn){
                 if(div > 5){
                     return false;
                 }
                list1.add(number);
                 break;
            }


        }

        for(int n : list1){
            if(n > 5){
                op = false;
            }
        }
       return op;
    }


}
