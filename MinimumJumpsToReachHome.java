class Solution {
    public int minimumJumps(int[] forbdden, int a, int b, int x) {
        
        
        int[] grid = new int[2000 + b];
        int diff = a - b;
        grid[0] = 1;
        int i = a;
     
       // dfs(null, forbidden, 0, a, b, x, false, grid);
        
      Set<Integer> forbidden = Arrays.stream(forbdden).boxed().collect(Collectors.toSet());
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0,0,1});
        while(!queue.isEmpty()){
            
            int[] arr = queue.poll();
            int pos = arr[0];
            int next = pos + a;
            int prev = pos - b;
            int val = arr[1];
           
            if(arr[0] == x){
                return val;
            }
            if(forbidden(forbidden,pos)){
                continue;
            }
            
            forbidden.add(pos);
            
              if(prev >= 0 && !forbidden(forbidden, prev ) && arr[2] != 2){
                 //System.out.println(" pos " + pos + " ne " + val);
                queue.offer(new int[]{prev,val+1, 2});
            }
            
            if(next < 6000 && !forbidden(forbidden,next)){
               //  System.out.println(" pos " + pos + " pre " + val);
                queue.offer(new int[]{next,val+1,1});
            }
          
          
        }
        
        return -1;
        //return grid[x] - 1;
        
    }

  
    
    boolean forbidden(Set s, int pos){
     return s.contains(pos);
    }
}