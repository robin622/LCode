package firstsemester.classes.string2;
public class Solution {

  public String replace(String input, String source, String target) {
    if(input == null || input.length() == 0 ||
     source == null || source.length() == 0 ||
     target == null) {
       return input;
     }
    //replace from back to front
    int addSpaces = 0;
    if(target.length() > source.length()) {
      addSpaces = getAddedSpace(input, source) * (target.length() - source.length());
      StringBuilder inputBuilder = new StringBuilder(input);
      for(int i = 0; i < addSpaces; i++){
        inputBuilder.append(" ");
      }
      input = inputBuilder.toString();
    }
    char[] cs = input.toCharArray();
    int right = input.length() - 1;
    int left = input.length() - 1 - addSpaces;
    while(left >= 0) {
      if(cs[left] != source.charAt(source.length()-1)) {
        cs[right] = cs[left];
        right--;
        left--;
      } else {
        if(isEqual(input, left, source)) {
          add(cs, right, target);
          left -= source.length();
          right -= target.length();
        } else {
          cs[right] = cs[left];
          right--;
          left--;
        }
      }
    }
    return new String(cs, right+1, cs.length -1 - right);
  }

  private void add(char[] cs, int right, String target) {
    for(int i = target.length() - 1; i >=0 ; i--, right--) {
      cs[right] = target.charAt(i);
    }
  }

  private boolean isEqual(String input, int left, String source) {
    for(int i = source.length() - 1; i >=0 ; i--, left--) {
      if(left < 0 || input.charAt(left) != source.charAt(i)) {
        return false;
      }
    }
    return true;
  }

  private int getAddedSpace(String input, String source) {
    int counter = 0;
    for(int i = 0; i <= input.length() - source.length(); i++) {
      if(input.substring(i, i+source.length()).equals(source)){
        counter++;
      }
    }
    return counter;
  }
  
  public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.replace("azerbaijanlatviaethiopiasyriacroatiaantarcticaanguilla", "botswana", "luxembourg"));
  }
}
