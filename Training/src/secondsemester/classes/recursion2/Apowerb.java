package secondsemester.classes.recursion2;

public class Apowerb {
    
    public double power(int a, int b) {
        if((a == 0 && b <=0)) {
            throw new ArithmeticException();
        }
        if(a == 0) {
            return 0;
        }
        if(b >=0) {
            return powerHelper(a, b);
        } else {
            return 1.0 / powerHelper(a, -b);
        }
    }
    
    //TC: O(logn) SC: O(logn)
    private int powerHelper(int a, int b) { //-2, 1, (-2, 2)
        if(b==0) {
            return 1;
        }
        int half = powerHelper(a, b/2);
        if(b % 2 == 0) {
            return half * half;
        } else {
            return half * half * a;
        }
    }
    
    public static void main(String[] args) {
        Apowerb t = new Apowerb();
        System.out.println(t.power(0, 1));
        System.out.println(t.power(-2, 1));
        System.out.println(t.power(-2, 2));
        System.out.println(t.power(2, -2));
    }

}
