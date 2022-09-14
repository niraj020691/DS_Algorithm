package Test;

public class OnlyForTestingCode {

    public static void main(String[] args){
        String s1 = "I am a Java expert";
        String s2 = new String ("I am a Java expert");
        String s3 = "I am a Java expert";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

    }
}
