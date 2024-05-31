package examplePolymerphism;

class Parent{
    void display(){
        System.out.println("I am from parent class");
    }
}
public class MethodOverride extends Parent{
    void display()
    {
        System.out.println("I am from methodoverride class");
    }

    public static void main(String[] args) {
        MethodOverride methodOverride = new MethodOverride();
        methodOverride.display();
    }
}
