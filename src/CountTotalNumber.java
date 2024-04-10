import java.util.Scanner;

public class CountTotalNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a String value "); // user input
        String Word = scanner.nextLine();

        int Count = 0;

        for (int i = 0; i < Word.length(); i++) {
            if (Word.charAt(i) == 'a') {
                Count++;
            }
        }

                System.out.println(" Total number of 'a' in the string: " + Count);
            }
        }


