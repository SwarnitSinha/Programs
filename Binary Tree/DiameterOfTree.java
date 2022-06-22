DIAMETER MEANS LONGEST PATH BETWEEN ANY TWO LEAF NODES

class Solution {
    int max = 0;
    public int util(TreeNode root){
      
        if(root==null)return 0;
        
        int leftHeight = util(root.left);
        int rightHeight = util(root.right);
        
        max = Math.max(max,leftHeight+rightHeight); //this will set the max diameter
        
        return Math.max(leftHeight,rightHeight)+1; // this will return the height
        
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        // l-height+r-height in every subtree
        // with a maximum
        
        util(root);
        return max;
        
    }
    
    
}
