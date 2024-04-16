// 12S22037 - Tiarani Sibarani
// 12S22049 - Agnes Harefa

import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kata;
        int a;
        
        kata = input.nextLine();
        a = 0;
        palindrom(a, kata);
    }
    
    public static String palindrom(int a, String kata) {
        String palindrom;
        
        palindrom = "benar";
        a = 0;
        while (a <= (double) kata.length() / 2 - 1 && palindrom.equals("benar")) {
            if (!String.valueOf(kata.charAt(a)).equals(String.valueOf(kata.charAt(kata.length() - a - 1)))) {
                palindrom = "false";
            }
            a = a + 1;
        }
        if (palindrom.equals("benar")) {
            System.out.println("YES");
        } else {
            if (palindrom.equals("false")) {
                System.out.println("NO");
            }
        }
        
        return palindrom;
    }
}
