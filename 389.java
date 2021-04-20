//389

class Solution {
    public char findTheDifference(String s, String t) {

       List<Character> first = new ArrayList<>();
        List<Character> second = new ArrayList<>();

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        for(char c : c1){
            first.add(c);

        }
        for(char c : c2){
            second.add(c);
        }

        for(char tt : first){
            int u = second.indexOf(tt);
            second.remove(u);
        }

        return second.get(0);

    }
}
