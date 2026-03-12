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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> queue=new LinkedList<>();
        boolean flag=true;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> li=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(flag){
                    li.add(node.val);
                }
                else{
                    li.add(0,node.val);
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            flag=!flag;
            ans.add(li);
        }
        return ans;
    }
}
