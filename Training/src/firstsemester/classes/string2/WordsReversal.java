package firstsemester.classes.string2;

public class WordsReversal {
    
    public String wordsReversal(String input) { // I love yahoo
        StringBuilder sb = new StringBuilder();
        String newStr = reverse(input);
//        String[] strArray = newStr.split(" ");   // use too much space here ... 
//        for(String temp : strArray) {
//            sb.append(reverse(temp)).append(" ");
//        }
//        return sb.deleteCharAt(sb.length()-1).toString();
        return reverseEachWord(newStr.toCharArray());
    }
    
    private String reverseEachWord(char[] cs) {
        int slow = 0; //assume first character is not space
        int fast = 0;
        while(fast < cs.length) {
            if(cs[fast] != ' '){
                fast ++;
            } else {
                reverse(cs, slow, fast-1);
                slow = fast + 1;
                fast = slow;
            }
        }
        if(slow != fast) {
            reverse(cs, slow, fast-1);
        }
        return new String(cs);
        
    }
    
    public String reverse(String str) {
        if(str == null || str.length() == 0) {
            return str;
        }
        char[] cs = str.toCharArray();
        reverse(cs, 0, cs.length - 1);
        return new String(cs);
    }
    
    private void reverse(char[] cs, int start, int end) {
        int first = start;
        int last = end;
        while(first < last) {
            char temp = cs[first];
            cs[first] = cs[last];
            cs[last] = temp;
            first++;
            last--;
        }
    }
    
    public static void main(String[] args) {
        WordsReversal wr = new WordsReversal();
        System.out.println(wr.wordsReversal("how are you!"));
    }

}
