import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsOf2Stringvalues {

    public static void main(String[]args){

        String[] array1 = { "apple","banaba", "orange","kiwi", "mango"};
        String[] array2 = {" banana","grape","apple","watermelon","mango"};

        Set<String> set1 = new HashSet<>(Arrays.asList(array1));
        Set<String> set2 = new HashSet<>(Arrays.asList(array2));

        set1.retainAll(set2);

        if (set1.isEmpty()) {
            System.out.println("No common elements found.");
        }else {
            System.out.println("Common elements are." + set1);
        }

    }
}

