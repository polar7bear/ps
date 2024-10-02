import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 모음은 다른 문자로 바뀔 수 있고,
        // 자음은 바뀌면 안됨, 맨 앞 글자와 맨 뒤 글자도 바뀌면 안됨
        // 자음만 빼서 판별?

        String str1 = br.readLine();
        String str2 = br.readLine();

        if (str1.charAt(0) != str2.charAt(0) || str1.charAt(str1.length() - 1) != str2.charAt(str2.length() - 1)) {
            System.out.println("NO");
            return;
        }

        String removeVowel1 = str1.replaceAll("[aeiou]", "");
        String removeVowel2 = str2.replaceAll("[aeiou]", "");
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        if (removeVowel1.equals(removeVowel2) && Arrays.equals(ch1, ch2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}