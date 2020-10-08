//554


class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> hashM = new HashMap<>();
        int n = wall.size();
        List<Integer> x = wall.get(0);
        int width = x.stream().reduce(0,(a,b) -> a+b);
        boolean singleton = true;
        for(List<Integer> l : wall){
            int si = 0;
            for(int i = 0; i < l.size() -1; i++){

                si += l.get(i);
                if(hashM.containsKey(si)){
                    hashM.replace(si, hashM.get(si)+1);
                }else{
                    hashM.put(si,1);
                }
            }
        }

        if(width != 0 && hashM.isEmpty()) return wall.size();

       List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hashM.entrySet());
        list.sort(Map.Entry.comparingByValue());
        return wall.size() - list.get(list.size() -1).getValue();
    }
}
