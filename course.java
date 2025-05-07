public class course {
    int sem ,marks;
    String sub;

    course(int sem,int marks,String sub){
        this.sem=sem;
        this.marks=marks;
        this.sub=sub;
    }
    void display(){
        System.out.println("Semester: "+sem);
        System.out.println("marks: "+marks);
        System.out.println("Sub: "+sub);
    }
    public static void main(String[] args) {
        course c1=new course(1,90,"Maths");
        c1.display();
    }
}
