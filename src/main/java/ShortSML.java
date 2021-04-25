public class ShortSML {
    static int MAX_CHAR = 26;

    public static String solution(String T) {
        char[] pat = "SML".toCharArray();
        char[] str = T.toCharArray();
        return sortByPattern(str, pat);
    }


    // Sort str according to the order defined by pattern.
    static String sortByPattern(char[] str, char[] pat)
    {
        // Create a count array stor
        // count of characters in str.
        int count[] = new int[MAX_CHAR];

        // Count number of occurrences of
        // each character in str.
        for (int i = 0; i < str.length; i++) {
            count[str[i] - 'A']++;
        }

        // Traverse the pattern and print every characters
        // same number of times as it appears in str. This
        // loop takes O(m + n) time where m is length of
        // pattern and n is length of str.
        int index = 0;
        for (int i = 0; i < pat.length; i++) {
            for (int j = 0; j < count[pat[i] - 'A']; j++) {
                str[index++] = pat[i];
            }
        }

        return String.valueOf(str);
    }

    public static void main(String args[])
    {

        System.out.println(solution("MSSLS"));
        System.out.println(solution("LLMS"));
        System.out.println(solution("SSM"));
    }
}
