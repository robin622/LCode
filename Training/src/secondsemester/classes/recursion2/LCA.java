package secondsemester.classes.recursion2;

public class LCA {
    
    static class TreeNode{
      int value;
      TreeNode left;
      TreeNode right;
    }
    
    //assume that a and b are not null and in the tree with root 
    public TreeNode LCA(TreeNode root, TreeNode a, TreeNode b) {
        if(root == null || root == a || root == b) {
            return root;
        }
        TreeNode left = LCA(root.left, a, b);
        TreeNode right = LCA(root.right, a, b);
        
        if(left != null && right != null) {
            return root;
        }
        return left == null ? right : left;

//        if(left == null && right == null) {
//            return null;
//        } else if(left == null) {
//            return right;
//        } else if(right == null) {
//            return left;
//        } else {
//            return root;
//        }
    }
    
    public static void main(String[] args) {
        
    }

}
