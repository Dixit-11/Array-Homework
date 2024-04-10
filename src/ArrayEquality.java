import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[]args){

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {1,2,3,4,6};

        System.out.println("Array1 equals to Array2:" + Arrays.equals(array1,array2));
        System.out.println("Array1 equals to Array3:" + Arrays.equals(array1,array3));

    }
}
