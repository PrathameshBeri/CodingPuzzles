//605

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length == 1 && n == 1 && flowerbed[0] == 0) return true;
        for(int i = 0; i < flowerbed.length; i++){
            System.out.println(i);
            if(flowerbed[i] == 1 ){
                i++;
                continue;
            }
            if(flowerbed[i] == 0){
                if(i == flowerbed.length-1) {n--; break;}
                if(flowerbed[i+1] == 0){ n--; i++;}

            }
        }

        return n <= 0? true:false;
    }
}
