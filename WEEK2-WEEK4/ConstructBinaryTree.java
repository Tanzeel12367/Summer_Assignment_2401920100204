import java.util.*;

class ConstructBinaryTree {
    int pi=0;
    Map<Integer,Integer> mp = new HashMap<>();

    public TreeNode buildTree(int[] pre, int[] in) {
        for(int i=0;i<in.length;i++) mp.put(in[i],i);
        return build(pre,0,in.length-1);
    }
    TreeNode build(int[] pre, int l, int r){
        if(l>r) return null;
        TreeNode node = new TreeNode(pre[pi++]);
        int mid = mp.get(node.val);
        node.left=build(pre,l,mid-1);
        node.right=build(pre,mid+1,r);
        return node;
    }
}
