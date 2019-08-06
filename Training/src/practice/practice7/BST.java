package practice.practice7;

public class BST {
    
    class TreeNode {
        int key;
        TreeNode left;
        TreeNode right;
        public TreeNode(int key) {
            this.key = key;
        }
    }
    
    //TC: O(n) SC: O(n)
    public TreeNode searchBST(TreeNode root, int target) {
        /*if(root == null || root.key == target) {
            return root;
        }
        if(root.key < target) {
            return searchBST(root.right, target);
        } else {
            return searchBST(root.left, target);
        } */
        while(root != null) {
            if(root.key == target) {
                return root;
            } else if(root.key < target) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return null;
    }
    
    public TreeNode insertBST(TreeNode root, int target) {
        if(root == null) {
            return new TreeNode(target);
        }
        insertBSTHelper(root, target, null);
        return root;
    }
    
    private void insertBSTHelper(TreeNode root, int target, TreeNode parent) {
        if(root == null) {
            if(target < parent.key) {
                parent.left = new TreeNode(target);
            } else {
                parent.right = new TreeNode(target);
            }
            return;
        }
        if(root.key == target) {
            return;
        }
        if(root.key < target) {
            insertBSTHelper(root.right, target, root);
        } else {
            insertBSTHelper(root.left, target, root);
        }
    }
    
    public static void main(String[] args) {
        
    }

}
