import java.util.*;

class Codec {
    public String serialize(TreeNode root) {
        if(root==null) return "null,";
        return root.val+","+serialize(root.left)+serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));
        return build(q);
    }
    TreeNode build(Queue<String> q){
        String s = q.poll();
        if(s.equals("null")) return null;
        TreeNode n = new TreeNode(Integer.parseInt(s));
        n.left=build(q);
        n.right=build(q);
        return n;
    }
}
