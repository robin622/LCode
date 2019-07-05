package class9;

public class BSTImplementation {
    
    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.value = val;
        }
    }
    
    public boolean searchInBST(TreeNode root, int target) {
        if(root == null) {
            return false;
        } else if (root.value == target) {
            return true;
        } else if (root.value > target){
            return searchInBST(root.left, target);
        } else {
            return searchInBST(root.right, target);
        }
    } 
    
    public TreeNode insert(TreeNode root, int target) {
        TreeNode curr = new TreeNode(target);
        if(root == null) {
            return curr;
        } else if(root.value < target) {
            if(root.right == null) {
                root.right = insert(root.right, target);
            } else {
                insert(root.right, target);
            }
        } else if(root.value > target) {
            if(root.left == null) {
                root.left = insert(root.left, target);
            } else {
                insert(root.left, target);
            }
        } else {
            //do nothing when equal
        }
        return root;
    }
    
    public TreeNode searchNodeInBST(TreeNode root, int target) {
        if(root == null) {
            return null;
        } else if (root.value == target) {
            return root;
        } else if (root.value > target){
            return searchNodeInBST(root.left, target);
        } else {
            return searchNodeInBST(root.right, target);
        }
    } 
    
    public TreeNode delete(TreeNode root, int target) {
       if(root == null) {
           return null;
       } else if(root.value == target) {
           if(root.left == null) {
               return root.right;
           } else if(root.right == null) {
               return root.left;
           } else if(root.left != null && root.right != null){
               TreeNode nd =removeLeftMaximum(root);
               swap(root, nd);
               return root;
           } else {
               root = null;
               return root;
           }
       } else if(root.value > target) {
           root.left = delete(root.left, target);
       } else if(root.value < target) {
           root.right = delete(root.right, target);
       }
       return root;
    }
    
    private void swap(TreeNode root, TreeNode nd) {
        int temp = root.value;
        root.value = nd.value;
        nd.value = temp;
    }

    private TreeNode removeLeftMaximum(TreeNode root) {
        TreeNode curr = root.left;
        TreeNode pre = null;
        while(curr != null && curr.right != null) {
            pre = curr;
            curr = curr.right;
        }
        if(pre != null) {
            pre.right = null; //unlink
        } else {
            root.left = null;
        }
        return curr;
    }
    
    public static void main(String[] args) {
        BSTImplementation bst = new BSTImplementation();
        TreeNode root = bst.new TreeNode(3);
        TreeNode rootLeft = bst.new TreeNode(1);
        TreeNode rootRight = bst.new TreeNode(5);
        TreeNode rootRightRight = bst.new TreeNode(6);
        TreeNode rootRightLeft = bst.new TreeNode(4);
        root.left = rootLeft;
        root.right = rootRight;
        rootRight.right = rootRightRight;
        rootRight.left = rootRightLeft;
        bst.delete(root, 5);
    }

}
