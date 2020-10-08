//500
class Solution {
    public String[] findWords(String[] words) {

        String top = "qwertyuiopQWERTYUIOP";
        String mid ="asdfghjklASDFGHJKL";
        String bot = "zxcvbnmZXCVBNM";

        List<String> ans = new ArrayList<>();

        for(String s : words){

            Character o = s.charAt(0);

            if(top.indexOf(o) != -1){

                boolean b = checkSingleRow(s,top);
                if(b) ans.add(s);
                continue;

            }else if(mid.indexOf(o) != -1){

                boolean b = checkSingleRow(s, mid);
                if(b) ans.add(s);
                continue;

            }else if(bot.indexOf(o) != -1){

                boolean b = checkSingleRow(s,bot);
                if(b) ans.add(s);
                continue;


            }

        }

        return ans.stream().toArray(String[]::new);

    }


    boolean checkSingleRow(String s, String t){

        for(int i = 0; i < s.length(); i++){

            Character o = s.charAt(i);

            if(!(t.indexOf(o) != -1)) return false;
        }

        return true;
    }
}
