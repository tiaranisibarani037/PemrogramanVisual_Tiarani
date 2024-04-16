// 12S22007 - Tamara Sianipar
// 12S22037 - Tiarani SIbarani

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, x, y;
        
        a = 1;
        x = 0;
        double hargaterkecil;
        double total;
        
        total = 0;
        double totalprice;
        double[] price = new double[100];
        
        while (a != 0) {
            price[x] = Double.parseDouble(input.nextLine());
            total = total + price[x];
            if (price[x] == 0) {
                a = 0;
            } else {
                x = x + 1;
            }
        }
        hargaterkecil = price[0];
        for (y = 0; y <= x - 1; y++) {
            if (hargaterkecil > price[y]) {
                hargaterkecil = price[y];
            } else {
                hargaterkecil = hargaterkecil;
            }
        }
        if (total > 100.00) {
            totalprice = total - hargaterkecil;
            System.out.println(toFixed(totalprice,2));
        } else {
            System.out.println(toFixed(total,2));
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
