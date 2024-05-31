package String;

public class VowelCount{
    public static void main(String[] args) {
        String name = "Nikhil";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char character = name.charAt(i);
            System.out.println(character);
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {

                count = count + 1;
            }

        }
        System.out.println("Name is " + name);
        System.out.println("Vowel letter is " + count);
    }
}
