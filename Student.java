public class Student {
    String name;
    int age;
    String dob;

    Student(String name,int age,String dob){
        this.name=name;
        this.age=age;
        this.dob=dob;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("DOB: "+dob);
    }

    public static void main(String[] args) {
        Student s1=new Student("Rahul",20,"1999-01-01");
        s1.display();
    }
}
