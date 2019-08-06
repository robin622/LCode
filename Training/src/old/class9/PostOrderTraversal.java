package old.class9;

import java.util.Deque;
import java.util.LinkedList;

import old.class9.BSTImplementation.TreeNode;

public class PostOrderTraversal {
    
    public void postOrder(TreeNode root) {
        
    }
    
    /*public void postOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode prev = null;
        stack.offerFirst(root);
        while(!stack.isEmpty()) {
            TreeNode current = stack.peekFirst();
            if(prev == null || current == prev.left || current == prev.right) {
                if(current.left != null) {
                    stack.offerFirst(current.left);
                } else if(current.right != null) {
                    stack.offerFirst(current.right);
                } else {
                    System.out.println(current.value);
                    stack.pollFirst();
                }
            } else if(prev == current.left) {
                if(current.right != null) {
                    stack.offerFirst(current.right);
                } else {
                    System.out.println(current.value);
                    stack.pollFirst();
                }
            } else {
                System.out.println(current.value);
                stack.pollFirst();
            }
            prev = current;
        }
    } */
    
    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.value = val;
        }
    }
    
    public static void main(String[] args) {
        PostOrderTraversal bst = new PostOrderTraversal();
        TreeNode root = bst.new TreeNode(3);
        TreeNode rootLeft = bst.new TreeNode(1);
        TreeNode rootRight = bst.new TreeNode(5);
        TreeNode rootRightRight = bst.new TreeNode(6);
        TreeNode rootRightLeft = bst.new TreeNode(4);
        root.left = rootLeft;
        root.right = rootRight;
        rootRight.right = rootRightRight;
        rootRight.left = rootRightLeft;
        bst.postOrder(root);
    }
}
