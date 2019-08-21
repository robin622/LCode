package regularclass.firstsemester.bitoperation;

public class ToHex {
    
    public String toHex(int num) {
        StringBuilder result = new StringBuilder("0x");
        for(int i = 7; i >=0; i--) {
            int curr = (num >> (4 * i)) & 15;
            if(curr == 0 && result.length() == 2) {
                continue;
            }
            if(curr > 9) {
                result.append((char)((curr - 10) + 'A'));
            } else {
                result.append(curr);
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        ToHex th = new ToHex();
        System.out.println(th.toHex(123));

    }

}
