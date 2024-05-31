package examplePolymerphism;
interface A{
    public void printx();
}
interface B{
    public void printy();
}
public class MultiOverride implements A,B{
    @Override
    public void printx() {
        System.out.println("This is x");
    }

    @Override
    public void printy() {
        System.out.println("This is y");
    }

    public static void main(String[] args) {
        MultiOverride mul=new MultiOverride();
        mul.printx();
        mul.printy();
    }
}