package String;
import java.util.Scanner;
public class reverseName {
    public static void main(String[] args) {


    System.out.println("Enter your name:");
    Scanner scanner= new Scanner(System.in);
            StringBuffer name= new StringBuffer(scanner.nextLine());
        name.reverse();
        System.out.println(name);
    }
}
