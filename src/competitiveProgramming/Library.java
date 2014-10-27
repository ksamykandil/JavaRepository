package competitiveProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ksamykandil on 10/27/14.
 */
public class Library {
    static int[] di = {0, -1, 0, 1};
    static int[] dj = {-1, 0, 1, 0};

    static int[] di_knight = {-1, -1, -2, -2, 1, 1, 2, 2};
    static int[] dj_knight = {2, -2, -1, 1, 2, -2, -1, 1};

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Check if String A is smaller lexicographically than String B
    public static boolean compareStringLexicographically(String A, String B) {
        if (A == null || B == null)
            return true;

        if (B.indexOf(A) == 0)
            return true;

        for (int i = 0; i < Math.min(A.length(), B.length()); i++) {
            if (A.charAt(i) != B.charAt(i))
                return A.charAt(i) < B.charAt(i);
        }

        return false;
    }

    // Read Integer
    public static int readInt() throws Exception {
        return Integer.parseInt(br.readLine());
    }

    // Read Integer
    public static int readInt(String str) throws Exception {
        return Integer.parseInt(str);
    }

    // Read Integer Array
    public static int[] readIntArray() throws Exception {
        String[] s = br.readLine().split(" ");
        int arr[] = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = readInt(s[i]);
        }

        return arr;
    }
}