class DiameterBinaryTree {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }
    int depth(TreeNode n){
        if(n==null) return 0;
        int l=depth(n.left), r=depth(n.right);
        max=Math.max(max,l+r);
        return 1+Math.max(l,r);
    }
}
