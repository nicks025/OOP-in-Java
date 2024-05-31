package String;

public class ShortName {
    public static void main(String[] args) {
        String n = "Ram";
        String m = "Bahadur";
        String lastName = "Thapa";
        char first = n.charAt(0);
        char middle = m.charAt(0);
        System.out.println("Given name is " + n + " " + m + " " + lastName);
        System.out.println("Converted name is " + Character.toString(first) + "." + Character.toString(middle) + " " + lastName);

    }
}
