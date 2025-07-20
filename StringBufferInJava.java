public class StringBufferInJava {
    public static void main(String[] args) {
        String string1="Hello ";
        String string2="World ";
        String string3="With Fazle Rabbi";

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(string1);
        stringBuffer.append(string2);
        stringBuffer.append(string3);


        System.out.println(stringBuffer);
    }
    
}
