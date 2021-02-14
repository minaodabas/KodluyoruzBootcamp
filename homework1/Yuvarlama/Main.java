package Yuvarlama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yuvarlamak istediginiz sayiyi giriniz:");
        float a = input.nextFloat();
        System.out.println("Lutfen asagı veya yukari olarak belirtiniz:");
        String b = input.next();
        if (b.equals("asagi")) {
            System.out.println(Math.floor((double) a));
        } else if (b.equals("yukari")) {
            System.out.println(Math.ceil((double) a));
        }
    }

}

