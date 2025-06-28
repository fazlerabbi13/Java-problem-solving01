
public class MaxMin {
   public static void main(String[] args) {
       int[] array = {12, 5, 27, 9, 18};
       int max = array[0];
       int min = array[0];

       for(int num:array){
        if(num>max){
            max=num;
        }
        if(num<min){
            min=num;
        }
       }
       System.out.println(max);
       System.out.println(min);
   } 
}
