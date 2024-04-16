// 12S22037 - Tiarani SIbarani
// 12S22049 - Agnes Harefa

import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nama = new String[10];
        int i;
        
        i = 0;
        evaluate(nama);
        room(nama);
    }
    
    public static void evaluate(String[] nama) {
        nama[0] = "";
        nama[1] = "";
        nama[2] = "";
        nama[3] = "";
        nama[4] = "";
        nama[5] = "";
        int i;
        
        i = 0;
    }
    
    public static void room(String[] nama) {
        int i;
        
        for (i = 0; i <= 5; i++) {
            nama[i] = "";
            while (i < 4) {
                nama[i] = input.nextLine();
                if (nama[i].equals("---")) {
                    i = 4;
                } else {
                    i = i + 1;
                }
            }
        }
        for (i = 0; i <= 3; i++) {
            if (nama[i].equals("---")) {
                i = i + 1;
            } else {
                System.out.println(nama[i]);
            }
        }
    }
}
