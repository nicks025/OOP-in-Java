package String;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class addTwoString {
    public static void main(String[] args) {
        //new project//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:  ");
        String nic = scanner.nextLine();
        int limit=2;
        if (nic.length()<limit){
            System.out.println("Need to add more Letter: ");
        } else {

            System.out.println(nic+nic+nic);
        }

    }
}
