public class SumAverage {
    public static void main(String[] args) {
        int[] array= {10, 20, 30, 40, 50};
        int sum = 0;
         for (int num : array) {
            sum += num;
        }
        System.out.println(array.length);
        System.out.println(sum);
    }
}
