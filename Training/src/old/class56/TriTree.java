package old.class56;

import java.util.ArrayList;
import java.util.List;

public class TriTree {
    
    TriNode root;
    
    public TriTree() {
        root = new TriNode();    
    }
    
    static class TriNode {
        TriNode[] children;
        boolean isWord;
        int counter;
        
        public TriNode() {
            children = new TriNode[26];
            isWord = false;
            counter = 0;
        }
    }
    
    public boolean search(String word) {
        TriNode curr = root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int idx = c - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.isWord;
    }
    
    public TriNode getCurrNode(String prefix) {
        TriNode curr = root;
        for(int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int idx = c - 'a';
            if(curr.children[idx] == null) {
                return null;
            }
            curr = curr.children[idx];
        }
        return curr;
    }
    
    public boolean addWord(String word) {
        TriNode curr = root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int idx = c - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new TriNode();
            }
            curr.children[idx].counter += 1;
            curr = curr.children[idx];
        }
        boolean ret = !curr.isWord;
        curr.isWord = true;
        return ret;
    }
    
    public void delete(String word) {
        if(search(word)) {
            //delete it
            TriNode curr = root;
            for(int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int idx = c - 'a';
                curr.children[idx].counter -= 1;
                if(curr.children[idx].counter == 0) {
                    curr.children[idx] = null;
                    return;
                }
                curr = curr.children[idx];
            }
            curr.isWord = false; //careful !!!!!!!! (if the node is in the middle)
        }
    }
    
    public List<String> getAllWordsWithPrefix(String prefix){
        TriNode currNode = getCurrNode(prefix);
        List<String> list = new ArrayList<String> ();
        if(currNode == null){
            return list;
        }
        getAllWordsWithPrefixHelper(currNode, new StringBuilder(prefix), list);
        return list;
    }
    
    private void getAllWordsWithPrefixHelper(TriNode currNode,
            StringBuilder sb, List<String> list) {
        if(currNode.isWord) {
            list.add(sb.toString());
        }
        TriTree.TriNode[] children = currNode.children;
        for(int i = 0; i < children.length; i++) {
            TriTree.TriNode tn = children[i];
            if(tn != null) {
                sb.append((char)('a' + i));
                getAllWordsWithPrefixHelper(tn, sb, list);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        TriTree tt = new TriTree();
        tt.addWord("abc");
        tt.addWord("abcd");
        tt.addWord("abe");
        tt.addWord("bac");
        System.out.println(tt.getAllWordsWithPrefix("c"));
//        System.out.println(tt.search("abe"));
//        tt.delete("abe");
//        System.out.println(tt.search("abe"));
//        System.out.println(tt.search("abc"));
//        tt.delete("ab");
//        System.out.println(tt.search("abc"));
//        System.out.println(tt.search("abe"));
//        tt.delete("abc");
//        System.out.println(tt.search("abcd"));
        
    }

}
