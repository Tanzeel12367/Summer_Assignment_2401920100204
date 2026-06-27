class BinaryTreeMaxPathSum {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        gain(root);
        return max;
    }
    int gain(TreeNode n){
        if(n==null) return 0;
        int l=Math.max(0,gain(n.left)), r=Math.max(0,gain(n.right));
        max=Math.max(max, n.val+l+r);
        return n.val+Math.max(l,r);
    }
}
