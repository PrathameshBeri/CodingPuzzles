class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), Integer.MAX_VALUE);
            }else{
                map.put(s.charAt(i), i);
            }
        }
        
        List<Map.Entry<Character,Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue());
        
        return list.get(0).getValue() == Integer.MAX_VALUE ? -1 : list.get(0).getValue();
    }
}