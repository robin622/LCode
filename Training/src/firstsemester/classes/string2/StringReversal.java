package firstsemester.classes.string2;

public class StringReversal {
    
    //TC: O(n) SC: O(n)
    public String reverseString(String input) {
        char[] cs = input.toCharArray();
        reverseChars(cs, 0);
        return new String(cs);
    }
    
    private void reverseChars(char[] cs, int index) {
        if(index >= cs.length / 2) {
            return;
        }
        reverseChars(cs, index + 1);
        swap(cs, index);
    }
    
    private void swap(char[] cs, int index) {
        char temp = cs[index];
        cs[index] = cs[cs.length - 1 - index];
        cs[cs.length - 1 - index] = temp;
    }
    
    public static void main(String[] args) {
        StringReversal sr = new StringReversal();
        System.out.println(sr.reverseString("abcde"));
    }

}
