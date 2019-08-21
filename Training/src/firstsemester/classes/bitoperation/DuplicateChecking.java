package firstsemester.classes.bitoperation;

public class DuplicateChecking {
    
    public boolean hasDuplicate(String input) {
        if(input == null || input.length() <= 1){
            return true;
        }
//        int num = 0;
//        for(int i = 0; i < input.length(); i++) {
//            int temp = 1 << (input.charAt(i) - 'a');
//            if((num & temp) >0) {
//                return true;
//            }
//            num |= temp;
//        }
//        return false;
        //input is ASCII code
        int[] bitVector = new int[8];
        for(int i = 0; i < input.length(); i++) {
            int itg = (int)input.charAt(i);
            int row = itg / 32;
            int column = itg % 32;
            int temp = 1 << column;
            if((bitVector[row] & temp) >0) {
                return true;
            }
            bitVector[row] |= temp;
        }
        return false;
    }
    
    public static void main(String[] args) {
        DuplicateChecking d = new DuplicateChecking();
        String str = "abcd!ACD~123";
        System.out.println(d.hasDuplicate(str));
    }

}
