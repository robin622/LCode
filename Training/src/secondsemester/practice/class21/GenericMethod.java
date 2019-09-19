package secondsemester.practice.class21;

public class GenericMethod {
    
    public static <fdas> void printArray(fdas[] array) {
        for(fdas e : array) {
            System.out.println(e.toString());
        }
    }
    
    public static void main(String[] args) {
        Double[] d = {1.0, 4.2, 5.1};
        Integer[] i = {1,2,3,4,5};
        printArray(d);
        System.out.println("----------------------------");
        printArray(i);
        System.out.println("--------------------------------------------");
        minMaxBonus(new Dog());
    }
    
    public static <E extends Animal> void minMaxBonus(E e) {
        //System.out.println();
        e.call();
    }

}
