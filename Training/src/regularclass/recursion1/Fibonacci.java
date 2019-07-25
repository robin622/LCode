package regularclass.recursion1;

public class Fibonacci {

    public int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();
        System.out.println(fb.fibonacci(10));
    }

}
