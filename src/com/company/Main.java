package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();

        double Toi = 26;
        double Hin = 20.5;
        double Et = 34;
        double Bm = 10.5;
        double Ht = 18;

        for (int i = 0; i < 10; i++) {

            switch (10) {
                case 1:
                    if (Toi + Hin < n) {
                        System.out.println("{Toi, Hin}");
                    }
                    break;
                case 2:
                    if (Toi + Et < n) {
                        System.out.println("{Toi, Et}");
                    }
                    break;
                case 3:
                    if (Toi + Bm < n) {
                        System.out.println("(Toi,Bm)");
                    }
                    break;
                case 4:
                    if (Toi + Ht < n) {
                        System.out.println("(Toi,Ht)");
                    }
                    break;
                case 5:
                    if (Hin + Et < n) {
                        System.out.println("{Hin, Et}");
                    }
                    break;
                case 6:
                    if (Hin + Bm < n) {
                        System.out.println("{Hin, Bm}");
                    }
                    break;
                case 7:
                    if (Hin + Ht < n) {
                        System.out.println("{Hin, Ht}");
                    }
                    break;
                case 8:
                    if (Et + Bm < n) {
                        System.out.println("{Et, Bm}");
                    }
                    break;
                case 9:
                    if (Et + Ht < n) {
                        System.out.println("{Et, Ht}");
                    }
                    break;
                case 10:
                    if (Bm + Ht < n) {
                        System.out.println("{Bm, Ht}");
                    }
                    break;
            }
        }
    }

}