import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silen";
        
        if (str1.length()!=str2.length()){
            System.out.println("not anagram");
        }

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();



        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1, arr2)){
            System.out.println("anagrams");
        }
    }
}

   