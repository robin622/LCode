package firstsemester.classes.bitoperation;

public class ReverseBits {
    
    public static long reverseBits(long n) {
      for(int i = 0; i < 16; i++) {
          long lowNum = (n >> i) & 1;
          long highNum = (n >> (31 - i)) & 1;
          System.out.println("low is :" + lowNum);
          System.out.println("high is :" + highNum);
          if(lowNum != highNum) {
              n ^= (1 << i);
              System.out.println("after first, n is : " + n);
              n ^= (1L << (31-i));
              System.out.println("after second, n is : " + n);
          }
      }    
      return n;
    }
    
    public static void reverseBits2(long n) {
        System.out.println((255L ^ (1 << 31)));
        System.out.println((255L ^ (0xFFFFFFFF80000000L)));
        //Otherwise it is an int literal, not a long (the leading zeroes being ignored). 
        //The ^ operator then promotes the first operand value from 0x80000001 to a long, 
        //but since the sign bit is set, the result of the promotion is 0xFFFFFFFF80000000L.
        
        //https://stackoverflow.com/questions/22651465/bitwise-xor-java-long
    }
    
    public static void main(String[] args) {
        long n = 255L;
        reverseBits2(n);
        //System.out.println(reverseBits(n));
    }

}
