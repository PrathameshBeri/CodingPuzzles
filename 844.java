//844

class Solution {
    public boolean backspaceCompare(String S, String T) {


        String g = removeHash(S);
        String h = removeHash(T);
        System.out.println(g);

        return g.equals(h);
    }

    static String removeHash(String s){

        Stack<Character> k = new Stack();
        int counter = 0;
        while(counter < s.length()){

           char u = s.charAt(counter);

            if(u  == '#' && k.isEmpty()){
                counter++;
                continue;
            }
            else if(!k.isEmpty() && u == '#'){
                k.pop();
            }else{
                k.push(u);
            }

            counter++;
        }

        StringBuffer t = new StringBuffer();
        while(!k.isEmpty()){
            char i = k.pop();
            t.append(i);
        }

        return t.toString();
    }
}
