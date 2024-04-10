
public class CommonElementsFinder {
    public static void main(String[] args) {

        String[] array1 = {"Golf", "Cricket", "Football", "Hockey", "basketball"};
        String[] array2 = {"basketball", "vollyball", "tennis", "cricket", "Football"};

        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)

            {
                if (array1[i] == array2[j]);
            }
            System.out.println("Common elements is :" + (array1[i]));
        }
    }
}




