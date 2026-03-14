class Student {
    String name;
    int rollNo;
    int age;
    String role;
    public Student(String name,int rollNo,int age,String role){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.role = role;
    } 
    public void display(){
        System.out.println("Name:" + name);
        System.out.println("Roll No:" + rollNo);
        System.out.println("Age:" + age);
        System.out.println("Role:" + role);
    }
}

public class Methods {
    public static void main(String[] args) {
        Student student1 = new Student("Pragati",26,21,"student");
        student1.display();
    }
}
