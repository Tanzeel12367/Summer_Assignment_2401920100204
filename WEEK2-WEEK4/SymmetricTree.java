class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.left, root.right);
    }
    boolean mirror(TreeNode l, TreeNode r){
        if(l==null&&r==null) return true;
        if(l==null||r==null) return false;
        return l.val==r.val && mirror(l.left,r.right) && mirror(l.right,r.left);
    }
}
