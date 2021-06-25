class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        Map<String,List<String>> map = new HashMap<>();
        
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String c = new String(chars);
            List<String> s = map.getOrDefault(c, new ArrayList<>());
            s.add(str);
            map.put(c, s);
        }
        
        return map.values().stream().collect(Collectors.toList());
    }
}