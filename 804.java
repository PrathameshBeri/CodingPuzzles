//804

class Solution {

    static String[] letts = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {

        Set<String> set = new HashSet<>();

        for(String s : words){

            StringBuilder sb = new StringBuilder();

            for(int i = 0 ; i < s.length(); i++){

                char t = s.charAt(i);
                sb.append(letts[t - 'a']);
            }

            set.add(sb.toString());

        }

        return set.size();
    }
}
