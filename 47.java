class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<Integer> k = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<List<Integer>> s = permuteHelper(k);
        
        List<List<Integer>> kk = s.stream().collect(Collectors.toList());
        
        return kk;
        
    
}


    
    public Set<List<Integer>> permuteHelper(List<Integer> avail){
        
        if(avail.size() == 1){
            Set<List<Integer>> s = new HashSet<>();
            s.add(avail);
            return s;
        }else{
     
            Set<List<Integer>> lis = new HashSet<>();
            for(int i = 0; i < avail.size(); i++){
                
                    
                List<Integer> avails = new ArrayList<>();
                for(int j = 0; j < avail.size(); j++){
                    if(j == i){
                        continue;
                    }else{
                        avails.add(avail.get(j));
                    }
                }
                  
                Set<List<Integer>> sol = permuteHelper(avails);
                for(List<Integer> s : sol){
                    
                  s.add(0, avail.get(i));
                    lis.add(s);
                    
                }
                
            }
              return lis;     
        }
    }
}