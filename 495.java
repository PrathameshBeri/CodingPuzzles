//495

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int[] nos = new int[10010000];
        int count = 0;
        int dur = duration;
        int u = 0;
        for(int i =0; i < timeSeries.length; i ++){

            int pos = timeSeries[i];

            nos[pos] += 1;
        }

        boolean swit = false;
        dur = 0;
        for(int y = 0; y < nos.length-1; y++){

            if(nos[y] > 0){
                dur = duration;
            }
            if(dur >0 ) {count++; dur--;}

        }

        return count;
    }
}
