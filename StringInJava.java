public class StringInJava {
    public static void main(String args[]){
        String string1 = "Hello, World";
        String stringUpdate=string1.concat(" I am here");

        StringBuffer s1= new StringBuffer(string1);

        s1.insert(6, "Fazle Rabbi");
        s1.append("are you ok!");
        s1.reverse();
        System.out.println(s1);
    }
}
