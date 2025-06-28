public class IndexOfAnElement {
    public static void main(String[] args) {
        int[] array= {4,5,7,10,9,1,};
        int target = 9;
        int index = -1;

        for(int i = 0; i<=array.length; i++){
           if(array[i] == target){
            index = i;
            break;
           }
        }
        if(index != -1){
            System.out.println(index);
        }
        else{
            System.out.println("no found");
        }
    }
}
