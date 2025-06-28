
public class SpecificValue {
    public static void main(String[] args) {
        int[] array = {4,7,1,6,9,8,10};
         int target = 6;
         boolean found = false;

         for(int num: array){
            if(num == target){
                found=true;
                break;
            }
         }
        System.out.println("Array contains " + target + ": " + found);    }
}
