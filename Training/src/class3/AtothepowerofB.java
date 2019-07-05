package class3;

public class AtothepowerofB {

    //TC: O(logb);
    //SC: O(logb);
    public long atothepowerofB(int a, int b){
//        if(b==1){
//            return b;
//        }
//        int half = atothepowerofB(a, b/2);
//        if(b%2==0){
//            return half * half;
//        } else {
//            return half * half * a;
//        }
        if(b==0) return 1;
        if(b==1) return a;
        if(b==2) return a * a;
        long third = atothepowerofB(a, b/3);
        if(b%3==0){
          return third * third * third;
        } else if(b%3==1){
          return third * third * third * a;
        } else {
          return third * third * third * a * a;
        }
    }
    
    public static void main(String[] args) {
        AtothepowerofB aofb = new AtothepowerofB();
        long start = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            aofb.atothepowerofB(15, 2000);
        }
        long end = System.currentTimeMillis();
        System.out.println("tims is:"+ (end-start));
    }

}
