
import java.util.Arrays;

public class SortAnArray{
    public static void main(String args[]){
        int[] array = {5,2,4,5,3,1,7};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
} 