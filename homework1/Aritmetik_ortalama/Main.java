package Aritmetik_ortalama;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();

        int toplam;
        for(toplam = 0; toplam <= 2000; ++toplam) {
            if (toplam % 3 == 0 && toplam % 5 == 0 && toplam % 7 == 0 && toplam % 53 == 0) {
                list.add(toplam);
            }
        }

        toplam = 0;

        for(int j = 0; j <= list.toArray().length; ++j) {
            toplam += j;
        }

        float aritmetik_ortama = (float)(toplam / list.toArray().length);
        System.out.println(aritmetik_ortama);
    }
}
