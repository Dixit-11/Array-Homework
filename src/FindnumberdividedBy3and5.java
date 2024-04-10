public class FindnumberdividedBy3and5 {
    public static void main(String[]args){

        System.out.println("\nDivided by3:");

        for (int i = 1; i<100; i++)
        {
            if (i % 3 == 0) // print number % 3
            {
                System.out.println(i + ",");

            }
        }

         System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}



