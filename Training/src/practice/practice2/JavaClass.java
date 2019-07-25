package practice.practice2;

public class JavaClass {

    class A {
        private int test1 = 1;
    }
    
    class B {
        A a = new A();
        int temp = a.test1;
    }
    
    public static void main(String[] args) {
        JavaClass ccc = new JavaClass();
        //System.out.println(ccc.new B().temp);
        
        System.out.println(ccc.new A().test1);
        
        ArrayTest at = new ArrayTest();
    }

}
