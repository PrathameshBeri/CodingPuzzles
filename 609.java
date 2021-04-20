//609

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {


        HashMap<String, List<String>> mapFile = new HashMap<>();


        for(String s : paths){


            String[] str = s.split(" ");

            for(int i  = 1; i < str.length; i ++){

                int n = str[i].indexOf('(');
                int m = str[i].indexOf(')');
                String y = str[i].substring(n+1,m);

                if(mapFile.containsKey(y)){
                    List<String> files = mapFile.get(y);
                    files.add(str[0] +"/"+ str[i].substring(0,n));

                }
                else{
                    List<String> files = new ArrayList<>();
                    files.add(str[0] +"/"+ str[i].substring(0,n));
                    mapFile.put(y, files);
                }
            }


        }

        List<List<String>> list = new ArrayList<>();
        Set<Map.Entry<String, List<String>>> entry = mapFile.entrySet();
        for(Map.Entry<String, List<String>> e :entry){
            List<String> k = e.getValue();
            if(k.size() > 1){
            list.add(e.getValue());
            }
        }
        return list;

    }
}
