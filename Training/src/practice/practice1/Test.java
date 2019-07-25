package practice.practice1;

public class Test {
    
    class Student{
        int age;
        public Student(int age){
            this.age = age;
        }
    }
    
    public void changeStudent(Student s){
        Student s2 = new Student(2);
        s = s2;
        s.age = 5;
    }
    
    public static void main(String[] args) {
        Test test = new Test();
        Student s1 = test.new Student(1);
        test.changeStudent(s1);
        
        System.out.println(s1.age);
    }

}
