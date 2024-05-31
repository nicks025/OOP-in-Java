package inheritance;
class Number{
    int x, y, z;
    Number(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    int getmax(){
        if((x>y) && (x>z)){
            return x;
        } else if ((y>x) && (y>z)) {
            return y;
        }
        else{
            return z;
        }
    }
}
public class NumberDemo extends Number {
    NumberDemo(int x, int y, int z){
        super(x, y, z);
    }

    public static void main(String[] args) {
        NumberDemo numberDemo= new NumberDemo(4,5,6);
        System.out.println("Greatest number is:"+numberDemo.getmax());
    }

}
