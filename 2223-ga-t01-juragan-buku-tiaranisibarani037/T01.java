// 12S22007 - Tamara Sianipar
// 12S22037 - Tiarani Sibarani
import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;
        String judul;
        String penulis;
        String tahunterbit;
        String penerbit;
        String formatbuku;
        double hargabeli;
        double minimalmargin;
        int stok;
        double ratingbuku;
        
        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = input.nextLine();
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        hargabeli = input.nextDouble();
        minimalmargin = input.nextDouble();
        stok = input.nextInt();
        ratingbuku = input.nextDouble();
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargabeli + "|" + minimalmargin + "|" + stok + "|" + ratingbuku);
    }
}
