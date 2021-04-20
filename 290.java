//290
class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()) return false;
        for(int i = 0; i < pattern.length(); i++){

            char a = pattern.charAt(i);
            String k = arr[i];

            if(map.containsKey(a) && !map.get(a).equals(k)){
                return false;
            }else if(map.containsValue(k) && !map.containsKey(a)){
                return false;
            }else{
                map.put(a,k);
            }
        }

        return true;
    }
}
