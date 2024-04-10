import java.util.Arrays;

public class RemoveElements {
    public static void main(String[]args){

        int[] array = {1,2,3,4,5};
        int elementsToremove = 3;

        int index = -1; // index of the elements to remove
        for (int i = 0; i< array.length; i++){
            if (array[i]==elementsToremove){
                index = i;
                break;
            }
        }

        if (index != -1) {
            //if elements is found, remove it by shifing elements to the left
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array = Arrays.copyOf(array, array.length - 1);
            System.out.println("Elements" + elementsToremove + "removed successfully");
            System.out.println("Array after removel:" + Arrays.toString(array));
        }else {
            System.out.println("Element" + elementsToremove + " not found in the array");

        }
    }
}
