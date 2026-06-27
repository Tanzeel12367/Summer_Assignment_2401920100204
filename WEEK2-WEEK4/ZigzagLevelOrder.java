import java.util.*;

class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean left=true;
        while(!q.isEmpty()){
            int sz=q.size();
            LinkedList<Integer> lvl = new LinkedList<>();
            for(int i=0;i<sz;i++){
                TreeNode n=q.poll();
                if(left) lvl.addLast(n.val);
                else lvl.addFirst(n.val);
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
            res.add(lvl);
            left=!left;
        }
        return res;
    }
}
