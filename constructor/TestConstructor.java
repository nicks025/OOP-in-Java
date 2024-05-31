package constructor;

public class TestConstructor {
    int roll;
    String name;
    String faculty;
    public TestConstructor(){
        System.out.println("Default constructor");
    }
    public TestConstructor(int r,String n){
        this.roll=r;
        this.name=n;
        System.out.println("Roll ="+this.roll);
        System.out.println("Name ="+this.name);
    }
    public TestConstructor(String f){
        this.faculty=f;
        System.out.println("Faculty ="+this.faculty);
    }
    public static void main(String[] args) {
        TestConstructor test=new TestConstructor();
        TestConstructor test1=new TestConstructor(1,"Nikhil");
        TestConstructor test2=new TestConstructor("BCA");

    }
}