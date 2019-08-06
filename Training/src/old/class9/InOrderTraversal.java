package old.class9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class InOrderTraversal {
    
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        if(root == null) {
            return ret;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root; // curr == null means the left subtree of stack top has finished visiting
        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.offerFirst(curr);
                curr = curr.left;
            }
            TreeNode tn = stack.pollFirst();
            ret.add(tn.val);
            curr = tn.right;
        }
        return ret;
    }
    
    public static void main(String[] args) {
        InOrderTraversal iot = new InOrderTraversal();
        TreeNode root = iot.new TreeNode(3);
        TreeNode rootLeft = iot.new TreeNode(1);
        TreeNode rootRight = iot.new TreeNode(5);
        TreeNode rootRightRight = iot.new TreeNode(6);
        TreeNode rootRightLeft = iot.new TreeNode(4);
        root.left = rootLeft;
        root.right = rootRight;
        rootRight.right = rootRightRight;
        rootRight.left = rootRightLeft;
        List<Integer> lst = iot.inOrder(root);
        for(Integer itg : lst) {
            System.out.println(itg);
        }
    }

}
