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
    List<Integer> result=new ArrayList<>();
    public void rightView(TreeNode root,int level){
        if(root == null) return;
        if(result.size()==level)
        result.add(root.val);
        rightView(root.right,level+1);
        rightView(root.left,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        rightView(root,0);

        /*if(root == null) return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null)
                queue.add(node.left);
                if(node.right!=null)
                queue.add(node.right);
                if(i==size-1)
                result.add(node.val);
            }
        }
        return result;*/
        return result;
    }
    
}
