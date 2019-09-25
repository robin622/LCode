package secondsemester.practice.class22.builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    
    private User(UserBuilder ub){
        this.firstName = ub.firstName;
        this.lastName = ub.lastName;
        this.age = ub.age;
        this.salary = ub.salary;
    }
    
    private static class UserBuilder{
        private String firstName;
        private String lastName;
        private int age;
        private double salary;
        public UserBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        public UserBuilder salary(double salary) {
            this.salary = salary;
            return this;
        }
        public User build(){
            if(this.firstName == null || this.lastName == null) {
                throw new IllegalArgumentException();
            }
            return new User(this);
        }
    }
    
    public static void main(String[] args) {
        User u = new User.UserBuilder()
                         .firstName("wei")
                         .lastName("zhao")
                         .age(3)
                         .salary(125.5)
                         .build();
        
        System.out.println("firstName is: " + u.firstName);
        System.out.println("lastName is: " + u.lastName);
        System.out.println("age is: " + u.age);
        System.out.println("salary is: " + u.salary);
    }

}
