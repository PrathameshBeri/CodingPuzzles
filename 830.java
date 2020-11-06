//830
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> list = new ArrayList<>();
        int count = 0;
        int star =0;
        char curc = s.charAt(0);
        boolean streak = false;
        for(int i =0; i < s.length(); i++){


            char a = s.charAt(i);
            if( a != curc){

                if(streak){
                    list.add(Arrays.asList(star, i-1));
                }

                streak = false;
                curc = a;
                count = 1;
                star = i;


            }else{

                count++;
                if(count >= 3){
                    streak = true;
                }
            }


        }

        if(streak){
             list.add(Arrays.asList(star, star+count-1));
        }

        return list;
    }
}
