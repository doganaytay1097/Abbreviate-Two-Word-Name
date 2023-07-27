import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Name Surname: ");

        String word = scanner.nextLine();

        System.out.println(AbbreviateTwoWords.abbrevName(word));
    }
}

class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
}