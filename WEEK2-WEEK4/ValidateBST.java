class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    boolean check(TreeNode n, long mn, long mx){
        if(n==null) return true;
        if(n.val<=mn||n.val>=mx) return false;
        return check(n.left,mn,n.val) && check(n.right,n.val,mx);
    }
}
