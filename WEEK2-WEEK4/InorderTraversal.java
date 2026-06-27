import java.util.*;

class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root,res);
        return res;
    }
    void dfs(TreeNode n, List<Integer> res){
        if(n==null) return;
        dfs(n.left,res);
        res.add(n.val);
        dfs(n.right,res);
    }
}
