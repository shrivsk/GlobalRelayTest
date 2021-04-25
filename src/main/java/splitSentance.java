import java.util.Arrays;

class splitSentance {

    public static int solution(String T) {
        String[]tokens = T.split("[.|?|!]");
        System.out.println(Arrays.toString(tokens));
        return tokens.length;
    }

    public static void main(String args[])
    {
        solution("we do coders. he are you there ? !stupit");
    }
}
