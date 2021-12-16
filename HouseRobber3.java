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
    public int rob(TreeNode root) {
        List<Integer> sums = new ArrayList<>();
        if(root.left == null && root.right == null){
            return root.val;
        }
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            int sum = 0;
            for(int i = 0; i < n; i++ ){
                TreeNode nod = queue.poll();
                if(nod.left != null){
                    queue.add(nod.left);
                }
                if(nod.right != null){
                    queue.add(nod.right);
                }
                sum += nod.val;
            }
            sums.add(sum);
        }
        
        int[] arr = sums.stream().mapToInt(x -> x).toArray();
        
        int[] dp = new int[arr.length  + 1];
        
        dp[0] = 0;
        dp[1] = arr[0];
        if(dp.length < 2){
            return dp[0] > dp[1] ? dp[0] : dp[1];
        }
        
        for(int i = 1; i < arr.length; i++){
            
            int maxSum = Math.max(dp[i], dp[i -1] + arr[i]);
            dp[i + 1] = maxSum;
        }
        return dp[arr.length];
    }
}