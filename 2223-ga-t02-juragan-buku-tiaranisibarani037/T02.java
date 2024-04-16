// 12S22007 - Tamara Sianipar
// 12S22037 - Tiarani Sibarani
import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;
        String judulbuku;
        String penulisbuku;
        String tahunterbit;
        String penerbit;
        String format;
        double hargabeli;
        double minmargin;
        int stok;
        double ratebuku;
        String rating;
        
        iSBN = input.nextLine();
        judulbuku = input.nextLine();
        penulisbuku = input.nextLine();
        tahunterbit = input.nextLine();
        penerbit = input.nextLine();
        format = input.nextLine();
        hargabeli = input.nextDouble();
        minmargin = input.nextDouble();
        stok = input.nextInt();
        ratebuku = input.nextDouble();
        if (ratebuku >= 4.7) {
            rating = "Best Pick";
        } else {
            if (ratebuku >= 4.5) {
                rating = "Must Read";
            } else {
                if (ratebuku >= 4.0) {
                    rating = "Recommended";
                } else {
                    if (ratebuku >= 3.0) {
                        rating = "Average";
                    } else {
                        rating = "Low";
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judulbuku + "|" + penulisbuku + "|" + tahunterbit + "|" + penerbit + "|" + format + "|" + hargabeli + "|" + minmargin + "|" + stok + "|" + ratebuku + "|" + rating);
    }
}
