// 12S22007 - Tamara Sianipar
// 12S22037 - Tiarani Sibarani
import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, tahunterbit, penerbit, formatbuku, rating, diskonbuku, futurerequest;
        double harga, minimummargin, rate, diskon;
        int stok;
        
        iSBN = input.nextLine();
        while (!iSBN.equals("---")) {
            judul = input.nextLine();
            penulis = input.nextLine();
            tahunterbit = input.nextLine();
            penerbit = input.nextLine();
            formatbuku = input.nextLine();
            harga = input.nextDouble();
            minimummargin = input.nextDouble();
            stok = input.nextInt();
            rating = input.nextLine();
            rate = input.nextDouble();
            if (rate >= 4.7) {
                rating = "Best Pick";
            } else {
                if (rate >= 4.5) {
                    rating = "Must Read";
                } else {
                    if (rate >= 4.0) {
                        rating = "Recommended";
                    } else {
                        if (rate >= 3.0) {
                            rating = "Average";
                        } else {
                            rating = "Low";
                        }
                    }
                }
            }
            diskon = -(minimummargin / harga) * 100;
            if (diskon >= 40) {
                diskonbuku = "Once in a lifetime";
            } else {
                if (diskon >= 20) {
                    diskonbuku = "Never Come Twice";
                } else {
                    if (diskon >= 0) {
                        diskonbuku = "No Regret";
                    } else {
                        diskonbuku = "---";
                    }
                }
            }
            if (diskon >= 40 && rate >= 4.7) {
                futurerequest = "The Ultimate Best";
            } else {
                futurerequest = "---";
            }
            System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + harga + "|" + minimummargin + "|" + stok + "|" + rating + "|" + rate + "|" + diskonbuku + "|" + futurerequest);
        }
        iSBN = "---";
    }
}
