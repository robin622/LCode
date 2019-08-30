package secondsemester.classes.dp1;

import java.math.BigInteger;

public class FB {
    
//    public long fibonacci(int K) {
//        if (K <= 0) {
//            return 0;
//        }
//        Long[] arr = new Long[K + 1];
//        arr[0] = 0L;
//        arr[1] = 1L;
//        for (int i = 2; i <= K; i++) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//        }
//        return arr[K];
//    }
    
    public BigInteger fibonacci(int K) {
        if (K <= 0) {
            return BigInteger.ZERO;
        }
        BigInteger[] arr = new BigInteger[K + 1];
        arr[0] = BigInteger.ZERO;
        arr[1] = BigInteger.ONE;
        for (int i = 2; i <= K; i++) {
            arr[i] = arr[i - 1].add(arr[i - 2]);
        }
        return arr[K];
    }
    
    public static void main(String[] args) {
        FB fb = new FB();
        System.out.println(fb.fibonacci(10000));
    }
}
