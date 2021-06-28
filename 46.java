class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<Integer> k = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return permuteHelper(k);
        
    }
    
    
    public List<List<Integer>> permuteHelper(List<Integer> avail){
        
        if(avail.size() == 1){
            List<List<Integer>> s = new ArrayList<>();
            s.add(avail);
            return s;
        }else{
            Set<Integer> set = new HashSet<>();
            List<List<Integer>> lis = new ArrayList<>();
            for(Integer i : avail){
                
                    
                List<Integer> avails = avail.stream().filter(x -> x != i).collect(Collectors.toList());
                    
                List<List<Integer>> sol = permuteHelper(avails);
                for(List<Integer> s : sol){
                    
                  s.add(0, i);
                    lis.add(s);
                    
                }
                
            }
              return lis;     
        }
        
        
    }
}