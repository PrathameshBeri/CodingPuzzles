/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        
        Map<Integer, Integer> sumCount = new HashMap<>();
        
        calculateHelper(root, sumCount);
        
        Set<Map.Entry<Integer,Integer>> entrySet = sumCount.entrySet();
        
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>();
        entryList.addAll(entrySet);
        Collections.sort(entryList, (a,b) ->  b.getValue() - a.getValue());
        //System.out.println(entryList.get(0).getValue());
        //System.out.println(entryList.get(entryList.size() -1).getValue());
        List<Integer> ans = new ArrayList<>();
        int max = entryList.get(0).getValue();
           for(Map.Entry<Integer, Integer> e : entryList){
           // System.out.println("k " + e.getKey() + "v " + e.getValue());
        }
        for(Map.Entry<Integer, Integer> e : entryList){
            if(e.getValue() == max){
                ans.add(e.getKey());
            }else{
                break;
            }
        }
    
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    void calculateHelper(TreeNode n, Map<Integer, Integer> map){
        
        if(n == null){
            return;
        }
        
        int leftSum = 0;
        int rightSum = 0;
        
        if(n.left != null){
            
            leftSum = sumHelper(n.left);
            //map.put(leftSum, map.getOrDefault(leftSum,0) + 1);
            calculateHelper(n.left, map);
           
            
        }
        
        if(n.right != null){
            rightSum =  sumHelper(n.right);
            // map.put(rightSum, map.getOrDefault(rightSum,0) + 1);
            calculateHelper(n.right, map);
          
        }
        
        int fs = n.val + leftSum + rightSum;
       // System.out.println(fs);
        map.put(fs, map.getOrDefault(fs,0) + 1);
        
    }
    
    int sumHelper(TreeNode n){
        if(n == null){
            return 0;
        }
        
        if(n.left == null && n.right == null){
            return n.val;
        }
        int sum = 0;
        sum += sumHelper(n.left);
        sum += sumHelper(n.right);
        sum+= n.val;
        return sum;
    }
}