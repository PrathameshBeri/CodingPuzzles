//205
class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            char y = t.charAt(i);
            if(hm.containsKey(x) ){
                if(!hm.get(x).equals(y)) return false;
            }
            else if(hm.containsValue(y) && !hm.containsKey(x)){
                return false;
            }
            else{
                hm.put(x,y);
            }
        }

        return true;
    }
}
