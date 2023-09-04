package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz :");
        heat = inp.nextInt();
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat < 10) {
            System.out.print("Sinemaya gidebilirsiniz");
        } else if (heat <= 15) {
            System.out.println("Sinema veya pikniğe gidebilirsiniz.");
        } else if (heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
